class Solution {
    public int maxArea(int[] height) {
        if(height.length<=1) return 0;
        int maxSum =0;

        for (int i = 0; i <height.length ; i++) {
            for (int j = height.length-1; j >i; j--) {

                maxSum= Math.max(maxSum,Math.min(height[j], height[i]) *(j-i));
                if(height[j]>= height[i]) break;

            }
        }

        return maxSum;
    }
}