package ds.linked_list;
public class LinkedList{
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head=null;
    private int size=0;

    public int size(){
        return size;
    }

    public void addFirst(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            size++;
            return;
        };

        node.next = head;
        head = node;
        size++;
    }

    public void addLast(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            size++;
            return;
        };
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

}