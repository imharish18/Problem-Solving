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


}
public class solving {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(0);
        st.push(99);
        st.push(199);
        st.push(299);
        st.display();
        st.pop();
        st.display();
    }
}
