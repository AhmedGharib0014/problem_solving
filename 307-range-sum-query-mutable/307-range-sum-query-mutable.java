/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */

class NumArray {

        int [] segmentTreeArray;

        int [] nums;


        public NumArray(int[] nums) {
            this.nums=nums;
            segmentTreeArray= new int[length(nums.length)];
            constructSegmentTree(0,nums.length-1,0);
        }

        int length(int length){
            if((length &(length-1))==0) return length*2-1;
            else {
            int temp =(int)Math.pow(2, Math.ceil(Math.log(length)/Math.log(2)));
             return temp*2-1;
            }
        }

        private void constructSegmentTree(int low, int high, int pos) {
            if(low==high) {
                segmentTreeArray[pos]=nums[low];
                return ;
            }

            int mid =(low+high)/2;

            constructSegmentTree(low,mid,pos*2+1);

            constructSegmentTree(mid+1,high,pos*2+2);

            segmentTreeArray[pos]=segmentTreeArray[pos*2+1]+ segmentTreeArray[pos*2+2];
        }


        public void update(int index, int val) {
            nums[index]=val;
            updateSegmentTree(0,nums.length-1,0,index);
        }

        private void updateSegmentTree( int low, int high, int pos,int index) {
            if (low == high ){
                segmentTreeArray[pos]= nums[low];
                return;
            }

            int mid= (low+ high)/2;

            if(index<=mid){
                updateSegmentTree(low,mid,pos*2+1,index);
            } else{
                updateSegmentTree(mid+1,high,pos*2+2,index);
            }

            segmentTreeArray[pos]=segmentTreeArray[pos*2+1]+ segmentTreeArray[pos*2+2];
        }

        public int sumRange(int left, int right) {
            return getSumRange(left,right,0,nums.length-1,0);
        }


        private int getSumRange(int qlow , int qhigh , int low , int high, int pos) {
            if(qlow<=low &&  qhigh>= high){
                return segmentTreeArray[pos];

            }else if(qlow>high || qhigh< low){
                return  0;
                
            }

            int mid = (low+high)/2;

            int leftSum =  getSumRange(qlow,qhigh,low,mid,pos*2+1);

            int rightSum = getSumRange(qlow,qhigh,mid+1, high,pos*2+2);

            return leftSum+rightSum;
        }

    }
