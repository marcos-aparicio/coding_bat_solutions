/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
*/
public String stringBits(String str) {
  String newS = "";
  for(int a = 0;a<str.length();a=a+2){
    newS += str.charAt(a);
  }
  return newS;  
}

