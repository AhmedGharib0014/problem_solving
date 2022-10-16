class Solution {
    class Num implements Comparable<Num> {
        int key;
        int freq;

        public Num(int x, int value) {
            this.key = x;
            this.freq = value;
        }


        @Override
        public int compareTo(Num o) {
            if(this.freq >o.freq)
                return 1;
            else if (this.freq < o.freq) {
                return -1;
            }else return 0;
        }
    }



    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        Queue<Num> queue = new PriorityQueue<Num>(Comparator.reverseOrder());

       for(int i : nums){

           map.put(i,map.getOrDefault(i,0)+1);
       }

      for (Map.Entry<Integer,Integer> entry : map.entrySet()){
          Num num =new Num(entry.getKey(),entry.getValue());
          queue.add(num);
      }

        for (int i = 0; i <k ; i++) {
            ans[i]=queue.poll().key;
        }

        return ans;
    }
}