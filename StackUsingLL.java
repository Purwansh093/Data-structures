
public class StackUsingLL {
    Node top;
    static class Node{
        int data;
        Node next;
    }
    public StackUsingLL() {this.top=null;}

    public void push(int key){
        Node newNode= new Node();
        if(newNode==null){
            System.out.println("Stack Overflow");
            return;
        }
        newNode.data=key;
        newNode.next=top;
        top=newNode;
    }

    public void display(){
        if(top==null){
            System.out.println("stack is empty");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack underflow");
            return;
        }
        top=top.next;
    }
    public void peek(){
        if(top==null){
            System.out.println("stack underflow");
            return;
        }
        System.out.println(top.data);
    }
    public static void main(String[] args) {
        StackUsingLL stack=new StackUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();            // 50 40 30 20 10
        stack.pop();
        stack.display();            // 40 30 20 10
        stack.pop();
        stack.display();
        stack.peek();
    }
}
