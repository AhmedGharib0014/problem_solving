class Solution {
    class  Num implements  Comparable<Num>{
        int index;
        int freq;
        Num(int i,int v){
            index=i;
            freq=v;
        }

        @Override
        public int compareTo(Num o) {
            if(this.freq<o.freq) return 1;
            else if(this.freq>o.freq) return -1;
            return 0;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> frequencies =new  HashMap<Integer,Integer>();
        int[] result =  new int[k];
        for(int s :nums){
            if(frequencies.containsKey(s)){
                frequencies.put(s,frequencies.get(s)+1);
            }else{
                frequencies.put(s,1);
            }
        }
        ArrayList<Num> numsObjects= new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : frequencies.entrySet()){
            numsObjects.add(new Num(entry.getKey(),entry.getValue()));
        }
        // add in the heap
        Collections.sort(numsObjects);

        for(int i=0;i<k;i++){
           result[i] = numsObjects.get(i).index;
        }
        
        return result;
    }
}