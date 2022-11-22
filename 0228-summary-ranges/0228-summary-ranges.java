class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0) return ans;

        int startInterval = 0;
        int endInterval = 0;

        for (int i = 1; i < nums.length ; i++) {
            if(nums[i] == nums[i-1]+1){
                endInterval++;
            }else {
                ans.add(intervalAsString(nums[startInterval],nums[endInterval]));
                startInterval=i;
                endInterval=i;
            }
        }
        
        ans.add(intervalAsString(nums[startInterval],nums[endInterval]));

        
        return ans;

    }


    public String intervalAsString(int start, int end) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(start);
        if (start != end) {
            stringBuilder.append("->");
            stringBuilder.append(end);
        }
        return stringBuilder.toString();
    }
}