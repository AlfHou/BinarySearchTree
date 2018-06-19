public class Main {
    public static void main(String[] args) {
        BinNode rotNode = new BinNode(2);
        rotNode.leggTil(4);
        rotNode.leggTil(1);
        rotNode.leggTil(1);
        rotNode.leggTil(200);
        rotNode.leggTil(-3);
        
        System.out.println(rotNode.number());
    }
}