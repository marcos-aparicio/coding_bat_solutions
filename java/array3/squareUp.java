/*
 *
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 *
 */
public int[] squareUp(int n) {
  int[] result = new int[n*n];
  for(int i = result.length-1, j = 0, max = 0; i > -1; i--){
    
    if( (i+1)%n == 0 ){
      max = (i+1)/n;
      j = 1;
    }
    result[i] = j;
    j++;
    if(j-1 > max) result[i] = 0;
    
  }
  return result;
}
