/*
 *  
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)


notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
 *
 *
 *
 *
 *
 */
public String notReplace(String str) {
  String result = "";

  for(int a = 0; a <str.length(); a++){
    result += str.charAt(a);
    
    if( a+2 > str.length() ) continue;
    boolean condition = str.substring(a,a+2).equals("is");
    if(!condition) continue;
    
    if(a != 0){
      condition &= !Character.isLetter(str.charAt(a-1));
    }
    
    if(a+2 != str.length() ){
      condition &= !Character.isLetter(str.charAt(a+2)); 
    }
    if(!condition) continue;
    
    result = result.substring(0,result.length()-1);
    result += "is not";
    a+=2;
    
    if( a != str.length() ) result += str.charAt(a);
  }
  return result;
}

