/*Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2*/


public int countHi(String str) {
        String target = "hi";
        return str.split(target, - 1).length - 1;
}
