/*Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true*/


public static boolean more14(int[] nums) {
        
        long count1 = Arrays.stream(nums)
            .filter(i -> i == 1)
            .count();
        
        long count4 = Arrays.stream(nums)
            .filter(i -> i == 4)
            .count();
        
        return count1 > count4;
    }
