class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> remainingMap = new HashMap< >();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {


            if(remainingMap.containsKey(nums[i])){

                result[0] = remainingMap.get(nums[i]);
                result[1] = i;

                return result;

            }

            remainingMap.put(target-nums[i],i);

        }


        return result;
    }

}