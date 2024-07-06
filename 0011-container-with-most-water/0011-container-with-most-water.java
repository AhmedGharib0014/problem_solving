class Solution {
    public int maxArea(int[] height) {

        if(height.length < 2) return 0;

        int area = 0;

        int leftIndex =0;
        int rightIndex = height.length- 1;

        while (rightIndex > leftIndex){
            int currentArea = calculateArea(height,leftIndex,rightIndex);
            if (currentArea > area) {
                area = currentArea;
            }
            if(height[leftIndex] > height[rightIndex])
                rightIndex --;
            else leftIndex ++;
        }

        return area;

    }

    public int calculateArea(int[] height , int leftIndex, int rightIndex){
        int maxHeight = Math.min(height[leftIndex],height[rightIndex]);
        return  maxHeight * (rightIndex-leftIndex);
    }

}