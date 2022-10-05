/*
 * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
 *
 *
 */
public boolean linearIn(int[] outer, int[] inner) {
  for(int in: inner){
    if(Arrays.binarySearch(outer,in) < 0) return false; 
    
  }
  return true;
}

