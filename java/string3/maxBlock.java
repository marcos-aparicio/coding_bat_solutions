/*
 *
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.


maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 *
 */
public int maxBlock(String str) {
  
  if(str.length() < 1) return 0;
  
  //minimum value for a block (in a string length greater than 0)
  int max = 1;
  int testing = 1;
  
  for(int a = 1; a<str.length(); a++){
    testing = str.charAt(a) == str.charAt(a-1)? testing + 1: 1;
    max = testing > max? testing: max;
  }
  
  return max;
}
