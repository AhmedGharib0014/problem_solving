class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans= new int[nums.length-k+1];
        Deque<Integer> deque = new LinkedList<Integer>();

        for (int i = 0; i < k; i++) {
            addAtLast(deque,nums[i]);
        }

        for (int i = 0; i+k  < nums.length  ; i++) {
            ans[i]=deque.peekFirst();
            if(nums[i] == deque.peekFirst()) deque.removeFirst();
            addAtLast(deque,nums[i+k]);
        }

        ans[ans.length-1]=deque.peekFirst();


        return  ans;

    }


    public  void  addAtLast(Deque<Integer> deque, int value){
        if(deque.isEmpty()) {
            deque.addLast(value);
            return;
        }
        while (!deque.isEmpty() && deque.peekLast() < value ){
            deque.removeLast();
        }
        deque.addLast(value);
    }


}