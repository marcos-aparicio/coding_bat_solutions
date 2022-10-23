/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
*/
public String frontTimes(String str, int n) {
  String newS = "";
  
  if(str.length() > n) str = str.substring(0,3);
  
  for(int a = 0;a<n;a++) newS += str;
  
  return newS;
  
}

