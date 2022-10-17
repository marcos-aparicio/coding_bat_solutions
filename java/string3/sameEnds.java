/*
 *
 *
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 *
 *
 */
public String sameEnds(String str) {
  
  String end = "";

  
  for(int a = 0; a<str.length(); a++){
    String beginning = str.substring(0,a);
    String ending = str.substring(str.length()-a);
    
    boolean first = beginning.equals(ending);
    boolean second = beginning.length() + ending.length()<= str.length();
        
    if( first && second) end = str.substring(0,a);
      
    
  }
  
  return end;
  
}
