/*
 *
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.


countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
 *
 */
public int countTriple(String str) {
  int count = 0;
  for(int a = 0; a < str.length()-2; a++){
    
    if( str.charAt(a) == str.charAt(a+1) &&
        str.charAt(a+1) == str.charAt(a+2) ) count ++;
    
  }
  return count;
}
