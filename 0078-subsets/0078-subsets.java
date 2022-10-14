class Solution {
     public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],i);
        }

        queue.add(new ArrayList<>());

        while (!queue.isEmpty()){
            int size = queue.size();



            for (int i = 0; i < size; i++) {

                ArrayList<Integer> temp = queue.poll();
                list.add(temp);
                int start=0;
                if(temp.size()>0){
                    start= map.get(temp.get(temp.size()-1))+1;
                }

                for (int j =start; j < nums.length ; j++) {
                    ArrayList<Integer> temp2 = new ArrayList<>(temp);
                    temp2.add(nums[j]);
                    queue.add(temp2);
                }

            }

        }

        return list;
    }




}