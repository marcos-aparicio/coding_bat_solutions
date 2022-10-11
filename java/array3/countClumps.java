/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.


countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
*/
public int countClumps(int[] nums) {
  boolean twoPlus = false;
  int count = 0;
  
  for(int i = 1; i<nums.length; i++){
    
    if(nums[i] != nums[i-1]){
      twoPlus = false;
      continue;
    }
    
    if(twoPlus) continue;
    
    count++;
    twoPlus = true;
  }
  
  return count;
}
