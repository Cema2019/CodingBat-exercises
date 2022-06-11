
/*Given an array of ints, return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false*/

public static boolean lucky13(int[] nums) {      
   List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
   return !list.contains(1) && !list.contains(3);
}
