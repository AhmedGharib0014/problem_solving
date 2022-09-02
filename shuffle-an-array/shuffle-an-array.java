class Solution {

   private  int[] num=null;
    Random random = new Random();

    public Solution(int[] nums) {
        this.num=nums;

    }

    public int[] reset() {
        return num;

    }

    public int[] shuffle() {
       int [] arr = num.clone();
       for(int i=0;i<arr.length;i++){
           int key = random.nextInt(arr.length);
           swap(arr,i,key);
       }
        return arr;
    }


    public void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}