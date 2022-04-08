public class solution {
    public int findKthPositive(int[] arr, int k) {
        int misssingcount =0;
        int index =0;
        int value=0;
        while (misssingcount<k){
            value++;
            if(index<arr.length && arr[index] == value ){
                    index ++;
                    continue;
            }else{
               misssingcount ++;
            }

        }
        return  value;
    }
    
}
