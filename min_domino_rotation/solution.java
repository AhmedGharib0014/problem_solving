


class Solution{
    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int minNumber =Integer.MAX_VALUE;
        int [] targets = {tops[0],bottoms[0]};

        for(int target : targets){
            int tempCounter=0;
            int i=0;
            for( i=0;i< tops.length;i++){
                if(tops[i]==target) continue;
                else if(bottoms[i] == target){
                    tempCounter +=1;
                    continue;
                }else{
                    break;
                }
            }

            if(i ==tops.length && tempCounter<minNumber){
                minNumber=tempCounter;
            }

            tempCounter=0;
            i=0;

            for( i=0;i< bottoms.length;i++){
                if(bottoms[i]==target) continue;
                else if(tops[i] == target){
                    tempCounter +=1;
                    continue;
                }else{
                    break;
                }
            }
            if(i ==bottoms.length && tempCounter<minNumber){
                minNumber=tempCounter;
            }

        }

       if(minNumber == Integer.MAX_VALUE) return -1;
       return minNumber;

    }

}