class MyQueue {

    Stack<Integer> pushStack ;
        Stack<Integer> popStack;

        public MyQueue() {
            pushStack = new Stack<>();
            popStack = new Stack<>();
        }

        public void push(int x) {
            pushStack.push(x);
        }

        public int pop() {
            if(empty()) return 0;
            if(popStack.isEmpty() && !pushStack.isEmpty()){
                transferElements();
            }
            return popStack.pop();

        }
        
        

        public int peek() {
            if(empty()) return 0;
            if(popStack.isEmpty() && !pushStack.isEmpty()){
                transferElements();
            }
            return popStack.peek();
        }
        
        public void  transferElements(){
            while (!pushStack.isEmpty()){
                popStack.push(pushStack.pop());
            }
        }

        public boolean empty() {
            return pushStack.isEmpty()&& popStack.empty();
        }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */