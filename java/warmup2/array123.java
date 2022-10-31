/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/
public boolean array123(int[] nums) {
  for(int a = 0;a<nums.length-2;a++){
    if(nums[a] == 1 && nums[a+1] == 2 && nums[a+2] == 3)
      return true;  
     
  }
  return false;
}

