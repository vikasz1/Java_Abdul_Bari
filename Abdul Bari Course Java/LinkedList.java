public class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
        public void push(int new_data){
            Node new_node = new Node(new_data);
            new_node.data = new_data;
            new_node.next = head;
            head = new_node;
        }
    }

}
