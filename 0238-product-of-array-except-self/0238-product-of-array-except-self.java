class Solution {
     public int[] productExceptSelf(int[] nums) {
        int [] prefixProduct =  calculatePrefixProduct(nums);
        int [] suffixProduct =  calculateSuffixProduct(nums);
        int[] result =  new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            
            if (i==0 && i+1 < nums.length) {
                result[0] = suffixProduct[i+1];
            }else if (i == nums.length-1){
                result[nums.length-1] = prefixProduct[i-1];
            }else {
                result[i] = prefixProduct[i-1] *  suffixProduct[i+1];
            }

        }

        return result;
    }

    private  int[] calculatePrefixProduct(int[] nums) {
        int [] prefixProduct = new int[nums.length];
        int product  = 1 ;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            prefixProduct[i] = product;
        }
        return prefixProduct;
    }

    private  int[] calculateSuffixProduct(int[] nums) {
        int []  suffixProduct= new int[nums.length];
        int product  = 1 ;

        for (int i = nums.length-1; i >= 0; i--) {
            product *= nums[i];
            suffixProduct[i] = product;
        }

        return suffixProduct;
    }

}