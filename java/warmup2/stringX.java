/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/
public String stringX(String str) {
  String newS = "";
  
  for(int a = 0;a<str.length();a++){
    if(a==0 || a == str.length()-1 || str.charAt(a) != 'x'){
      newS += str.charAt(a);
    } 
  }
  return newS;
}

