public class Mirror {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data  =data;
            this.left  = this.right = null;
               
        }
    }
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftmirror = createMirror(root.left);
        Node rightmirror = createMirror(root.right);
        
        root.left = rightmirror;
        root.right = leftmirror;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;

        }
        System.out.println(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
         * 8
         /  \
        5    10
       /  \     \
      3     6     11
         */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root = createMirror(root);
        preorder(root);

    }
    
}
