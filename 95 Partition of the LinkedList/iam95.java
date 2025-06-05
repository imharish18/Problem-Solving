public class iam95 {
        public static void partition(Node head, int x){

        Node a = new Node(-1);
        Node b = new Node(-1);

        Node ta = a;
        Node tb = b;

        Node temp = head;

        while(temp!=null){
            if(temp.val<x){
                ta.next=temp;
                ta=ta.next;
            }else{
                tb.next=temp;
                tb=tb.next;
            }   
            temp = temp.next;
        }
        tb.next = null;
        a=a.next;
        b=b.next;
        ta.next = b;

    }
}
