
/*Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true*/


public boolean no14(int[] nums) {
      List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
      return !list.contains(1) || !list.contains(4);
}
