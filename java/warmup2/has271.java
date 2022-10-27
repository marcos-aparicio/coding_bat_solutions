/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
*/
public boolean has271(int[] nums) {

  
  for(int a = 0;a<nums.length-2;a++){
    int thirdConditionNumber = nums[a]-nums[a+2];
    
    boolean secondCondition = nums[a+1]-nums[a]==5;
    boolean thirdCondition = thirdConditionNumber <= 3 && thirdConditionNumber >= -1;
    
    if(secondCondition && thirdCondition) return true;
    
  }
  
  return false;

}

