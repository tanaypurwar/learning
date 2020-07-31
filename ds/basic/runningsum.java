
//https://leetcode.com/problems/running-sum-of-1d-array/submissions/
/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
*/

class RunningSum {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] result =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=sum+nums[i];
            sum= result[i];
            
        }
        return result;   
    }
}