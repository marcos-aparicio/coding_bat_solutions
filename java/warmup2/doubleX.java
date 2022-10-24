/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/
boolean doubleX(String str) {
  if(str.length()<2)return false;
  
  int i = str.indexOf("x");
  int j = i+2>str.length()?str.length():i+2;
  
  return i != -1 && str.substring(i,j).equals("xx");
}

