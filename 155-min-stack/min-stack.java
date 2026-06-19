class MinStack {

    Stack <Integer> st1=new Stack();
    Stack <Integer> st2=new Stack();

    public MinStack() {
        //Constructor
    }
    
    public void push(int value) {
        if(st1.isEmpty()){
           st1.push(value);
           st2.push(value);
        }
        else{
            st1.push(value);
            st2.push(Math.min(value,st2.peek()));
        }

    }
    
    public void pop() {
        
          int elem=st1.peek();
          st1.pop();
          st2.pop();
         
    }
    
    public int top() {
        if (st1.isEmpty()){
            return -1;
        }
        else{
            return st1.peek();
        }
    }
    
    public int getMin() {
        if(st2.isEmpty()){
            return -1;
        }
        else{
            return st2.peek();
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */