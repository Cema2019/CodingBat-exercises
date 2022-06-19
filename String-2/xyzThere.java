/*Return true if the given string contains an appearance of "xyz" where the xyz is not directly 
preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true*/

public boolean xyzThere(String str) {
  return str.replaceAll("\\.xyz", "").contains("xyz");
}