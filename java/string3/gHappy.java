
/*
 We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.


 gHappy("xxggxx") → true
 gHappy("xxgxx") → false
 gHappy("xxggyygxx") → false 

 */
public boolean gHappy(String str) {
  
  for(int a = 0; a<str.length(); a++){
    if(str.charAt(a) != 'g') continue;
    
    boolean condition = false;
    
    if(a != str.length()-1) condition = str.charAt(a+1) == 'g';
    if(a != 0) condition |= str.charAt(a-1) == 'g';
    if(!condition) return false;
  }
  

  return true;
}
