
public class LinkedList {
        public static class Node {
            int data;
            Node next;
    
            public Node(int data) { // constructor
                this.data = data;
                this.next = null;
            }
        }
    
        public static Node head;
        public static Node tail;
        public static int size; //size by default is 0
    
        public void addFirst(int data) {   //addfirst
            // step 1 : create new node
            Node newNode = new Node(data); // class name Node object name newNode Node(data) is a constructor where data is
                                           // passed
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
    
            // step 2 - newNode next = head
            newNode.next = head; // linking one node to other (linked list created) head's address/reference is
                                 // stored in next.
    
            // step3 = head = newNode.
            head = newNode;
        }
    
        public void addLast(int data) {    //addlast
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
    
        public void print() { // print ll
            if (head == null) {
                System.out.println("Linked List is Empty");
                return;
            }
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void add(int idx, int data) { //add in the middle
            if(idx == 0){
                addFirst(data);   //add first operation for change of head.
                return;
            }
          Node newNode = new Node(data);
          size++;
          Node temp = head;
          int i = 0;
          while(i < idx-1){
            temp = temp.next;
            i++;
          }
          //i = idx-1;  temp -> prev
          newNode.next = temp.next;
          temp.next = newNode;
        }


    public int itrSearch(int key){ // TC = O(n)
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    public int helper(Node head, int key){   //TC= O(n)
        if(head == null){
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
    
        public static void main(String[] args) {  //main
            LinkedList ll = new LinkedList();
           
            ll.addFirst(2); // adding elements :1 Node     
            ll.addFirst(1); // adding elements :2 Node            
            ll.addLast(4); //adding last in ll          
            ll.addLast(5);
            ll.add(2,3);
            ll.print();  //1->2->3->4->5
            System.out.println(ll.recSearch(3));
            System.out.println(ll.recSearch(10));
        }
    }
    
    // addfirst TC = O(1)
    // addlast TC = O(1)
    
    //TC of this program is = O(n)
