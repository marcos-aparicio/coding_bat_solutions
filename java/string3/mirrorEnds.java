/*
 *
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".


mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 *
 */
public String mirrorEnds(String str) {

  String end = "";

  for(int a = 0; a<str.length(); a++){
    
    if(str.charAt(a) != str.charAt(str.length()-1-a) ) break;
    
    end += str.charAt(a);
  }
  
  return end;
}
