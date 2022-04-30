public class Leetcode1480 {

        //Running sum 1D Array


    public int[] runningSum(int[] nums) {

        int[] runningSum = new int[nums.length];

        int n=0;

        for(int i=0;i<nums.length;i++){

            n+=nums[i];
            runningSum[i]=n;

        }

        return runningSum;

    }
}
