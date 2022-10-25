/*
 *
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 *
 */
public boolean arrayFront9(int[] nums) {
  int count = nums.length;
  
  if(nums.length > 4) count = 4;
  
  for(int a = 0;a<count;a++)
    if(nums[a]==9) return true;
    
  return false;
}
