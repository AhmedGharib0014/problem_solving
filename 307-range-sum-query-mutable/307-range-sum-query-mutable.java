class NumArray {

        int [] segmentTreeArray;

        int [] nums;


        public NumArray(int[] nums) {
            this.nums=nums;
            
            System.out.println(nums.length);
            segmentTreeArray= new int[length(nums.length)];
            constructSegmentTree(nums,segmentTreeArray,0,nums.length-1,0);
        }

        public void update(int index, int val) {
            nums[index]=val;
            updateSegmentTree(nums,segmentTreeArray,0,nums.length-1,0,index);
        }

        public int sumRange(int left, int right) {

            return sum(left,right,0,nums.length-1,0);

        }

        int length(int length){
            if((length &(length-1))==0) return length*2-1;
            else {
               int temp =0;
               int i=1;
               while (temp<length){
                   temp=1<<i;
                   i++;
               }
               return temp*2-1;
            }
        }
        private void updateSegmentTree(int[] nums, int[] segmentTreeArray, int low, int high, int pos,int index) {
            if (low == high ){
                segmentTreeArray[pos]= nums[low];
                return;
            }

            int mid= (low+ high)/2;

            if(index<=mid){
                updateSegmentTree(nums,segmentTreeArray,low,mid,pos*2+1,index);
            }
            else{
                updateSegmentTree(nums,segmentTreeArray,mid+1,high,pos*2+2,index);
            }

            segmentTreeArray[pos]=segmentTreeArray[pos*2+1]+ segmentTreeArray[pos*2+2];

        }


        private int sum(int qlow , int qhigh , int low , int high,int pos) {
            if(qlow<=low &&  qhigh>= high){
                return segmentTreeArray[pos];
            }else if(qlow>high || qhigh< low){
                return  0;
            }

            int mid = (low+high)/2;

            int leftSum =  sum(qlow,qhigh,low,mid,pos*2+1);
            int rightSum = sum(qlow,qhigh,mid+1, high,pos*2+2);


            return leftSum+rightSum;
        }


        private void constructSegmentTree(int[] nums, int[] segmentTreeArray, int low, int high, int pos) {
            if(low==high) {
                segmentTreeArray[pos]=nums[low];
                return ;
            }

            int mid =(low+high)/2;

            constructSegmentTree(nums,segmentTreeArray,low,mid,pos*2+1);

            constructSegmentTree(nums,segmentTreeArray,mid+1,high,pos*2+2);

            segmentTreeArray[pos]=segmentTreeArray[pos*2+1]+ segmentTreeArray[pos*2+2];
        }
        
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */