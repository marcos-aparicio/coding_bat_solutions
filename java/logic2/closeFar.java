/*
 *
 * 
	Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

	closeFar(1, 2, 10) → true
	closeFar(1, 2, 3) → false
	closeFar(4, 1, 3) → true/
*
*
*/

public boolean closeFar(int a, int b, int c) {
  boolean closeConditionB = Math.abs(b-a) <= 1;
  boolean farConditionC = Math.abs(c-a) >= 2 && Math.abs(c-b) >= 2;

  boolean closeConditionC = Math.abs(c-a) <= 1;
  boolean farConditionB = Math.abs(b-c) >= 2 && Math.abs(b-a) >= 2;

  return (closeConditionB && farConditionC) ||
         (closeConditionC && farConditionB);
  
  
}
