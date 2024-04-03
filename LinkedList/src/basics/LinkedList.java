package basics;

public class LinkedList {
    Node start = null;
    private boolean isEmpty(){
        if(start == null) {
            return true;
        } return false;
    }

    public void insertAtEnd(Node n) {
        n.next = null;
        if(isEmpty()) {
            start = n;
        } else {
            Node t = start;
            while(t.next != null) {
                t = t.next;
            }
            t.next = n;
        }

    }

    public void insertAtStart(Node n) {
        n.next = null;
        if(isEmpty()) {
            start = n;
        }
        else {
            Node temp = null;
            temp = start;
            start = n;
            start.next = temp;
        }


    }

    public void printList() {
        Node current = start;
        while (current != null) {
            System.out.print(current.data + " " + current.next + "    ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = new Node(5);
        Node n1 = new Node(3);
        Node n2 = new Node(9);
        Node n3 = new Node(8);
        Node n4 = new Node(16);
//        list.insertAtStart(n2);
        list.insertAtEnd(head); // 5
        list.insertAtEnd(n1);   // 5 -> 3
        list.insertAtEnd(n2);   // 5 -> 3 -> 9
        list.insertAtEnd(n3);   // 5 -> 3 -> 9 -> 8
        list.insertAtEnd(n4);   // 5 -> 3 -> 9 -> 8 -> 16
//        list.insertAtStart(n2);
// this creates an infinite loop why?


        // print the list to ensure all the nodes are added correctly
        list.printList();



    }
}



