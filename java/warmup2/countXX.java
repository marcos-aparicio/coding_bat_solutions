/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
*/
int countXX(String str) {
  int count = 0;
  
  for(int a = 0;a<str.length()-1;a++){

    if(str.charAt(a)=='x'&&str.charAt(a+1)=='x') count += 1;

  }
  return count;  
  
}

