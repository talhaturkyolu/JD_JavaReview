package LinkedListClassExample;

public class CyberLinkedList {
    public class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public Node first;
    public Node last;
    public int size;

    public CyberLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void addLast(int item){
         
    }

}
