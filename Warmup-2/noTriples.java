/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. 
Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false*/

public static boolean noTriples(int[] nums) {
        return java.util.stream.IntStream.range(0, nums.length - 2)
                        .noneMatch(i -> nums[i] == nums[i+1] && nums[i] == nums[i+2]);
}
