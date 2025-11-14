class Node{
    int data;
    Node next;
    Node(){}

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    public LinkedList() {this.head= null;}
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next != null) temp=temp.next;
            temp.next=newNode;
        }
    }
    public void insertAfter(int data1, int data2){
        Node temp=head;
        if(head==null) return;
        while(temp.data!=data1){
            temp=temp.next;
            if(temp==null) return;
        }
        Node temp2 = temp.next;
        Node newNode= new Node(data2);
        temp.next=newNode;
        newNode.next=temp2;
    }
    public void display(){
        if(head==null){System.out.println("LL is empty");}
        else{
            Node temp = head;
            while(temp.next!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public void deleteFromStart(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        } else{
            head=head.next;
        }
    }
    public void deleteElement(int key){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        if(head.data==key){
            deleteFromStart();
        }else{
            Node current=head;
            Node slow=null;
            Node fast=null;
            while(current != null && current.data!=key){//
                slow=current;
                current=current.next;
                fast=current.next;
            }
            if(current==null){
                System.out.println("element not found");
                return;
            }
            slow.next=fast;
        }
    }
    public static void main(String[] args) {
        LinkedList MyLinkedList = new LinkedList();
        MyLinkedList.insertAtEnd(10);
        MyLinkedList.insertAtEnd(20);
        MyLinkedList.insertAtEnd(30);
        MyLinkedList.insertAtEnd(40);
        MyLinkedList.insertAtEnd(50);
        MyLinkedList.display();
        // MyLinkedList.insertAfter(20, 100);
        // MyLinkedList.display();

        MyLinkedList.deleteFromStart();
        MyLinkedList.display();

        MyLinkedList.deleteElement(30);
        MyLinkedList.display();

        MyLinkedList.deleteElement(200);// element not present in linkedList
        MyLinkedList.display();
    }
}
