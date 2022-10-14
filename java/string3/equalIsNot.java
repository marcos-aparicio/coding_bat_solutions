/*
 *
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).


equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 *
 */
public boolean equalIsNot(String str) {
  int count1 = 0;
  int count2 = 0;
  
  for(int a = 0; a<str.length(); a++){
    
    if( a >= str.length()-1 ) continue;
    
    if( str.substring(a,a+2).equals("is") ) count1++;
  
    if( a >= str.length()-2 ) continue;
    
    if(str.substring(a,a+3).equals("not") ) count2++;
    
    
  
  }
  
  return count1 == count2;
}

