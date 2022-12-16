import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class Remove{
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
    public static int size;


    public void addfirst(int data){
        //step 1= create new node
        Node newnode = new Node(data);
        size++;
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
        size++;
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
    public int removeFirst() {
        
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        //prev : i=size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp =head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;

            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;

        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;

        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);

    }
    public void reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthfromend(int n){
        //calculate size
        int size=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        //size-n
        int i=1;
        int iTofind = size-n;
        Node prev = head;
        while(i<iTofind){
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return;
    }
    //Slow Fast Approach
    public Node Findmid(Node mid){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2

        }
        return slow; //slow is my midnode
    }

    // Detect a loop/cycle in a LL
    public static boolean iscycle(){
        Node slow = head;
        
    }
    
    public static void main(String[] args) {
        Remove l1 = new Remove();
        //l1.head = new Node(1);
        //l1.head.next = new Node(2);
        
        l1.addfirst(2);
        l1.addfirst(1);
        l1.addlast(3);
        l1.addlast(4);
        l1.print();
        //System.out.println(l1.size);
        //l1.removeFirst();
        //l1.print();
        //l1.removelast();
        //l1.print();
        System.out.println(l1.size);
        // System.out.println(l1.itrSearch(3));
        // System.out.println(l1.itrSearch(10));
        //System.out.println(l1.recSearch(3));
        //System.out.println(l1.recSearch(10));
        //l1.reverse();
        //l1.print();
        l1.deleteNthfromend(2);
        l1.print();

        


        
    }
}