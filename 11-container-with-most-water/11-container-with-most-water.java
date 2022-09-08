class Solution {
    public int maxArea(int[] height) {
        if(height.length<=1) return 0;
        int maxVolume =0;

        int i=0;
        int j=height.length-1;

        while (j>i){
            maxVolume= Math.max(maxVolume,Math.min(height[j], height[i]) *(j-i));
            if(height[j]>= height[i]) i++;
            else j--;
        }

        return maxVolume;
    }
}