public class solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result =new ArrayList<List<Integer>>();
          Arrays.sort(nums);
          for(int i=0;i<nums.length-2;i++){
              int k=nums.length-1;
              int j=i+1;
              while(j < k){
                  int sum=nums[i]+nums[j]+nums[k];
                  if(sum == 0){
                      List<Integer> temp= new ArrayList<Integer>();
                      temp.add(nums[i]);
                      temp.add(nums[j]);
                      temp.add(nums[k]);
                      result.add(temp);
                      
                     do{
                          j++;
                      }while(j < nums.length-1 && nums[j-1] == nums[j]) ;
                      
                  }else if(sum > 0){      
                          k--;         
                  }else{
                          j++;
                       
                  }
  
              }
              while(i < nums.length-1 && nums[i]==nums[i+1]){
                  i++;
              }
              
          }
          return  result;
          
      }

      
}
