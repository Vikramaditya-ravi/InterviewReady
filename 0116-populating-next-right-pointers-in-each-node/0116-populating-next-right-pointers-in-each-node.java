/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if (root == null) {
                return null;
            }
            Queue<Node> queue = new LinkedList<>();

            queue.add(root);
            int h = 1;
            int n = 1   ;

            while (!queue.isEmpty()) {
                    Node curr = queue.poll();

                    if (n >= 0 && n < h) {
                        curr.next = queue.peek();
                        n++;
                    } else {
                        curr.next = null;
                        h = h * 2;
                        n = 1;
                    }

                    if (curr.left != null) queue.add(curr.left);
                    if (curr.right != null) queue.add(curr.right);


            }
            return root;
        
    }
}