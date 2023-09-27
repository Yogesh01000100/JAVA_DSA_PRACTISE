package yogesh_package.LINKED_LIST;

public class linked_list {

    private Node head;
    private Node tail;

    private int size;

    public linked_list()
    {
        this.size=0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next=next;
        }
    }


    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }

    public void displayNodes()
    {
        Node temp=head;
        System.out.print("HEAD->");// first node is the head itself
        while(temp!=null)
        {
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }// last node is iteself the tail
    }

    public void insertAtPLace(int place,int value)
    {
        Node node=new Node(value);
        Node temp=head;
        for (int i = 0; i < place-1; i++) {
            temp=temp.next;
        }   
        node.next=temp.next;
        temp.next=node;
        size++;
    }

    public void insertLast(int value)
    {   
        if(tail==null)
        {
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node; // just we are positioning the new last node as the tail
        size++;
    }

    public int deleteFirst(){
        int val=head.value;
        Node temp=head;
        head=temp.next;
        size--;
        return val;
    }

    public int deleteAtPlace(int place)
    {   Node temp=head;
        for (int i = 1; i < place; i++) {
            temp=temp.next;
        }
        int val=temp.next.value;   
        temp.next=temp.next.next;

        return val;
    }
}
