class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class SLL{
    Node head;
    Node tail;
    int sz=0;

    public void insertAtStart(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        sz++;
    }

    public void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        sz++;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void size(){
        System.out.println("Size of the Linked List: "+sz);
    }

}
public class Iimch{
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
        list.size();
        list.insertAtStart(2);
        list.insertAtStart(3);
        list.insertAtStart(4);
        list.insertAtEnd(30);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
        list.size();
    }
}


