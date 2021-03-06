/*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false*/

public static boolean has22(int[] nums) {
        
        boolean result = IntStream.range(0, nums.length-1)
                .anyMatch( i -> nums[i] == 2 && nums[i + 1] == 2);
                
        return result;
}
