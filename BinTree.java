public class BinTree {
    BinNode root;
    public BinTree() {

    }
    public void add(int data) {
        if (root == null) {
            root = new BinNode(data);
            return;
        } else {
            root.add(data);
        }
    }
     //Function that returns the number of nodes in the tree
     public int number() {
        if (root == null) {
            return 0;
        } else {
            return root.number();
        }
    }
}