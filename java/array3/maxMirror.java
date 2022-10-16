/*
 *

We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.


maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
 *
 *
 */


public int maxMirror(int[] nums) {
  if(nums.length <= 1) return nums.length;
  
  int[] result = new int[nums.length];
  int max = 0, count = 0;
  
  for(int i = 0; i < result.length; i++) result[i] = nums[nums.length-1-i];
  
  for(int i = 0, j = 0; j < result.length-1; i++){
    count = 0;
    
    if(result[j] != nums[i]) continue;
    int a = j; count++; 
    
    while(i<result.length-1 && a<result.length-1){
      i++; a++;
      
      if(result[a] != nums[i]){
        count = 0;
        a = j-1;
        continue;
      }
    
      count ++;
      max = Math.max(count,max);
    }
    i = -1; j++;
  }
  return max;
  
}
