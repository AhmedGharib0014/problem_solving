 class MyStack {
          private Queue<Integer> que1;

        private Queue<Integer> que2;

        boolean popFromFirst = true;
        
        public MyStack() {
            que1= new LinkedList<>();
            que2= new LinkedList<>();

        }

        public void push(int x) {
            if(popFromFirst){
                que2.add(x);
            }else {
                que1.add(x);
            }
        }

        public int pop() {
           if(popFromFirst && que1.isEmpty()){
               transferFromSecondToFirst();
               return que2.poll();
           }
           
           if(!popFromFirst && que2.isEmpty()){
               transferFromFirstToSecond();
               return que1.poll();
           }
           
           if (popFromFirst){
               return que1.poll();
           }else {
               return que2.poll();
           }
        }

        public int top() {
            if (popFromFirst && que1.isEmpty()) {
                transferFromSecondToFirst();
               int peek= que2.peek();
                que1.add(que2.poll());
                return peek;
            }

            if (!popFromFirst && que2.isEmpty()) {
                transferFromFirstToSecond();
                int peek= que1.peek();
                que2.add(que1.poll());
                return peek;
            }

            if (popFromFirst){
                return que1.peek();
            }else {
                return que2.peek();
            }
        }


        private void transferFromFirstToSecond(){
                while (que1.size() >1){
                    que2.add(que1.poll());
                }
                popFromFirst=true;
        }

        private void transferFromSecondToFirst(){
            while (que2.size() >1){
                que1.add(que2.poll());
            }
            popFromFirst=false;
        }

        

        public boolean empty() {
            return que1.size()==0 && que2.size()==0;
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */