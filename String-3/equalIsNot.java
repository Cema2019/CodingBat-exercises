/*Given a string, return true if the number of appearances of "is" anywhere in the string is 
equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true*/

public boolean equalIsNot(String str) {
  return str.split("is", - 1).length - 1 == str.split("not", - 1).length - 1;
}
