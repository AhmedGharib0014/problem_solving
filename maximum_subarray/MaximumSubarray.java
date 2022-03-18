package maximum_subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaximumSubarray {
    // Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
       if(nums.length ==1) return  nums[0];
       int currSum = nums[0];
       int maxSum=nums[0];

       for (int i=1;i<nums.length;i++){
           currSum=Math.max(currSum+nums[i],nums[i]);
           maxSum=Math.max(maxSum,currSum);
       }
       return  maxSum;
    }


    // sliding  window with different size
//    public static int maxSubArray(int[] nums) {
//        int sum=nums[0];
//        for(int windowSize=0;windowSize<nums.length;windowSize++){
//            int i=0;
//
//            // calculate window summision
//            int tempSum=nums[0];
//            if(windowSize>0){
//                for(int j=i+1;j<=windowSize;j++){
//                    tempSum += nums[j];
//                }
//            }
//            if(tempSum>sum) sum=tempSum;
//
//            // slide window
//            while (i+windowSize<nums.length-1){
//                tempSum -= nums[i];
//                tempSum += nums[i+windowSize+1];
//                if(tempSum>sum) sum=tempSum;
//                i++;
//            }
//        }
//        return  sum;
//    }

    // two loops
//    public int maxSubArray(int[] nums) {
//        int sum =nums[0];;
//        for(int i=0;i<nums.length;i++){
//            int tempSum=0;
//            for(int j=i;j<nums.length;j++){
//                tempSum=tempSum+nums[j];
//                if(tempSum>sum) sum=tempSum;
//            }
//
//        }
//        return  sum;
//
//    }


    public static void main(String[] args) {
        int[] nums={5,4,-1,7,8};
        System.out.println(maxSubArray(nums));

    }
}
