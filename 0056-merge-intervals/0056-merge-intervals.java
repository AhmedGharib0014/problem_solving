class Solution {
    
    class Interval implements Comparable<Interval> {
        int start;
        int end;

        public Interval(int s, int e) {
            this.start = s;
            this.end = e;
        }

        int[] toArray(){
            int[] array = new int[2];
            array[0]= start;
            array[1]= end;
            return array;
        }


        @Override
        public int compareTo(Interval o) {
            if(this.start >o.start)
                return 1;
            else if(this.start <o.start)
                return -1;
            else
            return 0;
        }
    }


    public int[][] merge(int[][] input) {
        if(input.length<2) return input;

        Interval[] intervals = new Interval[input.length];
        ArrayList<Interval> resultList = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            intervals[i] = new Interval(input[i][0],input[i][1]);
        }

        Arrays.sort(intervals);

        Interval current = intervals[0];

        for (int i = 1; i < input.length; i++) {
            Interval it = intervals[i];
            if(it.start <= current.end){
                current.end = Math.max(current.end, it.end);
            }else {
                resultList.add(current);
                current=it;
            }
        }

        resultList.add(current);

        int[][] result = new int[resultList.size()][2];

        for (int i = 0; i < resultList.size() ; i++) {
            result[i] = resultList.get(i).toArray();
        }

        return result;
    }

}