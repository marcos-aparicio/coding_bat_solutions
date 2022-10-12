/*
 *
(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.


fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
 *
 *
 */
public int[] fix45(int[] nums) {
  int[] result = nums.clone();
  int[] position = new int[nums.length];
  int count = 0;
  int fix1 = 4;
  int fix2 = 5;
  
  
  for(int i = nums.length-1, j = 0; i > -1; i--){
      if(nums[i] == fix1) count++;
      
      if(nums[i] != fix2) continue;
      position[j] = i;
      j++;
  }
  for(int i = result.length, j = 0; i > -1; i--){
    
    if(i-1 < 0 || result[i-1] != fix1 || result[i] == fix2) continue;
    
    int changePosition = result[i];
    result[i] = fix2;
    result[position[j]] = changePosition;
    j++;  
  
  }
  return result;
}
