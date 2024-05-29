public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node n1 = new Node();
        n1.data = "A";
        Node n2 = new Node();
        n2.data = "B";
        Node n3 = new Node();
        n3.data = "C";
        tree.insert("C" , 1);
        tree.insertRight(3 , n1);
        tree.insertRight(4 , n2);
        tree.insertLeft(1 , n3);
        tree.find(4);
        tree.find(1);

    }
}