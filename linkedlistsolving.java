
public class linkedlistsolving {
    public Node middleNode(Node head) {
        Node temp = head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        len=len/2+1;
        temp = head;
        for(int i=0; i<len-1; i++){
            temp=temp.next;
        }
        return temp;
    }
}
