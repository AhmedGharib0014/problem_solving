class MinStack {

      LinkedList stack;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        stack=  new LinkedList<Integer>();
    }

    public void push(int val) {
        stack.push(val);
        if(val<min) min=val;
    }

    public void pop() {
      int val= (int)   stack.pop();
        
      if(val==min){
          min=Integer.MAX_VALUE;
          
          for(int i=0;i< stack.size();i++){
              if((int)stack.get(i) < min){
                 min=(int) stack.get(i);
              }
          }
          
      }
       
    }

    public int top() {
       return(int) stack.peek();
    }

    public int getMin() {
       return (int) min;
    }



}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */