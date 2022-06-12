/*Given two arrays, A and B, of non-negative int scores. 
A "special" score is one which is a multiple of 10, such as 40 or 90. 
Return the sum of largest special score in A and the largest special score in B. 
To practice decomposition, write a separate helper method which finds the largest special score in an array. 
Write your helper method after your scoresSpecial() method in the JavaBat text area.

scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
scoresSpecial([12, 11, 4], [2, 20, 31]) → 20*/

//Solution with a method.

public int scoresSpecial(int[] a, int[] b) {
return biggest(a) + biggest(b);
}

private int biggest(int[] arr) {
return Arrays.stream(arr).filter(i -> i % 10 == 0).max().orElse(0);
}

//Or straight without a method

public int scoresSpecial(int[] a, int[] b) {
      int firstArr = Arrays.stream(a).filter(i -> i % 10 == 0).max().orElse(0);
      int secondArr = Arrays.stream(b).filter(i -> i % 10 == 0).max().orElse(0);
      return Integer.sum(firstArr, secondArr);
}
