public class Main {
    public static void main(String[] args) {
        BinTree tree = new BinTree();
        tree.add(4);
        tree.add(1);
        tree.add(1);
        tree.add(200);
        tree.add(-3);
        tree.add(80);
        
        System.out.printf("Number of nodes: %d\n", tree.number());
        System.out.printf("Sum of all nodes: %d\n", tree.sum());

    }
}