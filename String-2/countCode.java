/*Return the number of times that the string "code" appears anywhere in the given string, 
except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2*/

public int countCode(String str) {
  return str.split("co\\we", - 1).length - 1;   //Using regex (\\w)
}
