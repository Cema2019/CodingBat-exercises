/*Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true*/

public boolean catDog(String str) {
    int cat = str.split("cat", - 1).length - 1;
    int dog = str.split("dog", - 1).length - 1;
    return cat == dog;
}
