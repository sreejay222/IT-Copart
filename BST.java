class BST {
 
   
    class Node 
    {
        int data;
        Node left, right;
 
        public Node(int item) 
        {
            data = item;
            left = right = null;
        }
    }
 
    Node root;
 
    BST() 
    { 
        root = null; 
    }
 

    void insert(int key) 
    {
       root = insertRec(root, key);
    }
     

    Node insertRec(Node root, int key) 
    {
 
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
 
        return root;
    }
 
    void inorder()  {
       inorderRec(root);
    }
 

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }
 

    public static void main(String[] args) 
    {
        BST tree = new BST();
        tree.insert(12);
        tree.insert(13);
        tree.insert(15);
        tree.insert(6);
        tree.inorder();
    }
}
