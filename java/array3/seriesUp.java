/*
 *
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.


seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
 *
 *
 */



public int[] seriesUp(int n) {
  int sum = n*(n+1)/2;
  int[] result = new int[sum];
  
  for(int i = 0, j = 0, max = 1; i<result.length; i++){
      j = 0;
      while(j < max && i< result.length){
        result[i] = j+1;
        j++;i++;
      }
      i--;
      max ++;
      
  }

  return result;
}
