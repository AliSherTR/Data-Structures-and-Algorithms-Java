public class Tree<T> {
    private Node root;

    public Node find(int key) {
        Node current = root;
        while(current.key != key) {
            if(key < current.key) {
                current = current.leftChild;
            }
            else
                current = current.RightChild;

            if(current == null) {
                System.out.println("No Node found!!");
                return null;
            }
        }
        System.out.println("data: " + current.data + " key: " +current.key );
        return current;
    }

    public void insertRight(int key , Node newNode) {
        newNode.key = key;
        if(root == null) {
            root = newNode;
            System.out.println("added as root");
        }
        else {
            Node current = root;
            while(current.RightChild != null) {
                current = current.RightChild;
            }
            current.RightChild = newNode;
        }
    }

    public void insertLeft(int key , Node newNode) {
        newNode.key = key;
        if(root == null) {
            root = newNode;
            System.out.println("added as root");
        }
        else {
            Node current = root;
            while(current.leftChild != null) {
                current = current.leftChild;
            }
            current.leftChild = newNode;
        }
    }

    public void insert(T data , int key) {
        Node newNode = new Node();
        newNode.key = key;
        newNode.data = data;

        if(root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent;

        while(true) {
            parent = current;
            if(newNode.key < current.key) {
                current = current.leftChild;
                if(current== null) {
                    parent.leftChild = newNode;
                    return;
                }
            }
            else if(newNode.key > current.key){
                current = current.RightChild;
                if( current == null ) {
                    parent.RightChild = newNode;
                    return;
                }
            }
            else {
                System.out.println("There is already a node with the same key!! Use another key");
                return;
            }
        }
    }
}
