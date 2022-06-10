/*
Given an array of ints, return the number of times that two 6's are next to each other in the array. 
Also count instances where the second "6" is actually a 7.

array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1*/

public static int array667(int[] nums) {
        long count = IntStream.range(0, nums.length - 1)
                        .filter(i -> nums[i] == 6 && nums[i + 1] == 6 || nums[i + 1] == 7)
                        .count();
        return (int)count;
}
