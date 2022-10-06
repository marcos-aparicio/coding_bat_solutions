/*
 * 
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 *
 */
public int sumNumbers(String str) {
  char[] arr = str.toCharArray();
  String number = "";
  int sum = 0;
  
  for(int a = 0; a<arr.length; a++){
    
    if(!Character.isDigit(arr[a]) ) continue;
    
    number += arr[a];
    
    if(a<arr.length-1 && Character.isDigit(arr[a+1]) ) continue;
    
    sum += Integer.parseInt(number);
    number = "";
  }
  
  return sum;


}
