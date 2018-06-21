public class Main {
    public static void main(String[] args) {
        BinNode rotNode = new BinNode(2);
        rotNode.add(4);
        rotNode.add(1);
        rotNode.add(1);
        rotNode.add(200);
        rotNode.add(-3);
        
        System.out.println(rotNode.number());
    }
}