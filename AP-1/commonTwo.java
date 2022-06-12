/*Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. 
Return the count of the number of strings which appear in both arrays. 
The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.

commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3*/


public int commonTwo(String[] a, String[] b) {
        List<String> list1 = Arrays.stream(a).distinct().collect(Collectors.toList());
        List<String> list2 = Arrays.stream(b).distinct().collect(Collectors.toList());
        list1.retainAll(list2);
        return list1.size();
}
