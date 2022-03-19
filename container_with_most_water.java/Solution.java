public class Solution {
    
    public static int maxAreaOptimal(int[] height) {
        int maxContainer=0;
        int i=0;
        int j=height.length-1;

        while (i<j){
            if(height[j]>height[i]){
                maxContainer = Math.max(maxContainer,height[i]*(j-i));
                i++;
            }else{
                maxContainer = Math.max(maxContainer,height[j]*(j-i));
                j--;
            }

        }

        return  maxContainer;
    }

   public static int maxArea(int[] height) {
       int maxContainer=0;
       for(int i=0;i<height.length-1;i++){
           int j=height.length-1;
           int maxAtIndex =0;
           while (j>i){
               if(height[j]>height[i]){
                   maxAtIndex = Math.max(maxAtIndex,height[i]*(j-i));
                   break;
               }else{
                   maxAtIndex = Math.max(maxAtIndex,height[j]*(j-i));
               }
               j--;
           }
           if(maxAtIndex>maxContainer) maxContainer=maxAtIndex;
       }
       return  maxContainer;
   }

   public static void main(String[] args) {
    int[] test={1,8,6,2,5,4,8,3,7};
    System.out.println(maxArea(test));
   }
}
