class Solution {
    public int lengthOfLIS(int[] nums) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        int max=1;

        
        if(nums.length<1) return 0;
        if(nums.length <2) return 1;
        else {
            ArrayList<Integer> tem= new ArrayList<Integer>();
            tem.add(nums[0]);
            map.put(max,tem);

        }


        for (int i = 1; i < nums.length; i++) {

            int tempMax= max;
            while (tempMax>0){
                ArrayList<Integer> list = map.get(tempMax);
                boolean done = false;
                for (int j : list){
                    if(nums[i]>j){
                        tempMax++;
                        ArrayList<Integer> list2=  map.getOrDefault(tempMax,new ArrayList<Integer>());
                        list2.add(nums[i]);
                        map.put(tempMax,list2);
                        if(tempMax>max)max=tempMax;
                        done = true;
                        break;
                    }
                }
                if(done) break;
                else tempMax--;
            }

            if (tempMax<=0){
                ArrayList<Integer> list2=  map.get(1);
                list2.add(nums[i]);
            }
        }

        return max;
    }
}