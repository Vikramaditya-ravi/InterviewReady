// package com.ravi.codeChef.August.aug14.aug16;

//public class MinStack {
//}
class MinStack {

    public Node node;

    public void push(int val) {
        if (node == null){
            node = new Node(val,val,null);
        }
        else {
            node = new Node(val,Math.min(val, node.min),node);
        }

    }

    public void pop() {
        node = node.next;

    }

    public int top() {
        return node.val;

    }

    public int getMin() {
       return node.min;

    }
    public class Node{
        int val;
        int min;
        Node next;

        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
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