public class solution {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int index=0;
            int index1=nums1.length-m;
            int index2=0;
    
            for(int i=m-1;i>=0;i--){
                nums1[i+(nums1.length-m)]=nums1[i];
            }
    
    
            while (index1 <nums1.length && index2 < n){
                if(nums1[index1] <  nums2[index2]){
                    nums1[index]= nums1[index1];
                    index1 ++;
                }else{
                    nums1[index]=nums2[index2];
                    index2 ++;
                }
                index ++;
            }

             while (index1 < nums1.length){
                    nums1[index]= nums1[index1];
                    index1 ++;
                    index ++;
             }

            while (index2 < n){
                nums1[index]=nums2[index2];
                index2 ++;
                index ++;
            }      
        }
    }
    
}
