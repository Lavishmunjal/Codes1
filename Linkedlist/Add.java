public class Add{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    public void addfirst(int data){
        //step 1= create new node
        Node newnode = new Node(data);
        if(head == null){
            head =tail= newnode;
            return;
        }
        //step 2
        newnode.next = head;
        //step 3
        head = newnode;
    }
    public void addlast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        //l1.head = new Node(1);
        //l1.head.next = new Node(2);
        l1.print();
        l1.addfirst(2);
        l1.print();
        l1.addfirst(1);
        l1.print();
        l1.addlast(3);
        l1.print();
        l1.addlast(4);
        l1.print();
               
    }
}