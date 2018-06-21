class BinNode {
    int data;
    BinNode left;
    BinNode right;

    public BinNode(int data) {
        this.data = data;
    }
    //Function that returns the number of nodes in the tree
    public int number() {
        int count = 1;
        if (left != null) {
            count += left.number();
        }
        if (right != null) {
            count += right.number();
        }
        return count;
    }
    //Function that adds a new node to the tree
    public void add(int data) {
        //Because this search tree only accepts integers I only need to use the < and > operator and not the compareTo() function

        if (data == this.data) {
            return;

        //If the node to the right is smaller than the number I am trying to add, and the pointer to the right isnt empty
        //recursion is used on the node to the right
        } else if (data > this.data && right != null) {
            right.add(data);

        } else if (data < this.data && left != null) {
            left.add(data);

        } else if (data > this.data) {
            right = new BinNode(data);

        } else if (data < this.data) {
            left = new BinNode(data);
        }
    }
}