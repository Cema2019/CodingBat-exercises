
/*Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.


tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false*/


public boolean tripleUp(int[] nums) {
  return IntStream.range(0, nums.length - 2)
              .anyMatch(i -> nums[i] + 1 == nums[i+1] && nums[i+1] + 1 == nums[i+2]);
}
