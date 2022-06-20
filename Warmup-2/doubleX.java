/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true*/

boolean doubleX(String str) {
    return !str.contains("x") ? false : 
      str.substring(str.indexOf("x")).startsWith("xx");  
}
