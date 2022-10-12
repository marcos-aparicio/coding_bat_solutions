/*
 *
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 *
 *
 */
public boolean canBalance(int[] nums) {
int max = nums.length-1;
for(int i = 0; i<nums.length; i++){

int firstSum = intArraySum(nums,0,max-i);
int secondSum = intArraySum(nums,max,max-i);

if(firstSum == secondSum && nums.length != 1) return true;

}
return false;
}


public int intArraySum(int[] nums, int from, int to){
int sum = 0;


if(to > from) for(int i = from; i<to;i++) sum += nums[i];
else if (from > to) for(int i = from; i>to-1; i--) sum += nums[i];
else sum = nums[to];

return sum;

}
