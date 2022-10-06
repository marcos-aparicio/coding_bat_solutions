/*
 * 
  Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
 *
 * */
public int maxSpan(int[] nums) {
  
  int max = 0;
  for(int i = 0; i < nums.length; i++){
    int testing = getMaxIndex(nums,nums[i])-(i-1);
    max = testing > max? testing: max;
  }
  return max;
}

public int getMaxIndex(int[] nums, int val){
  for(int i = nums.length-1; i >= 0; i--){
    if(nums[i] == val) return i;
  }
  return -1;
}
