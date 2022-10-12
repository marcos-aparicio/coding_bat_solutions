/*
 *
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.


fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
 *
 */
public int[] fix34(int[] nums) {
  int[] result = nums.clone();
  int[] position = new int[nums.length];
  int count = 0;
  int fix1 = 3;
  int fix2 = 4;
  
  
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
