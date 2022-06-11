/*Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.

scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true*/


public boolean scores100(int[] scores) {
  return java.util.stream.IntStream
                .range(0, scores.length - 1)
                .anyMatch(x -> scores[x] == 100 && scores[x + 1] == 100);
}
