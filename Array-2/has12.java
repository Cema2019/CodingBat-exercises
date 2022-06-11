/*Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true*/


public boolean has12(int[] nums) {
  
    boolean result = java.util.stream.IntStream.range(0, nums.length-1)
                .anyMatch(i -> nums[i] == 1 && nums[nums.length-1] == 2);
                
    return result;
}
