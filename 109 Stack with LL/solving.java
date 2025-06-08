class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Stack{
    int size=0;
    Node head=null;
    public boolean isEmpty(){
        if(head==null) return true;
        else return false;
    }
    public int size(){
        return size;
    }
    public void push(int val){
        Node temp = new Node(val);
        if(head==null) head=temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
        System.out.println("Value added "+head.val);
    }
    public void pop(){
        if(head==null) System.out.println("Stack is Empty");
        else head=head.next;
        size--;
    }
    public int peek(){
        if(head==null) return -1;
        else return head.val;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void displayRecursion(Node head){
        if(head==null) return;
        displayRecursion(head.next);
        System.out.print(head.val+" ");
    }
    public void displayRev(){
        displayRecursion(head);
    }

}
public class solving {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(0);
        st.push(99);
        st.push(199);
        st.push(299);
        st.push(199);
        st.push(299);
        st.push(199);
        st.push(299);
        st.display();
        System.out.println(st.size);
        st.pop();
        System.out.println(st.size);
        st.display();
        st.displayRev();
    }
}
