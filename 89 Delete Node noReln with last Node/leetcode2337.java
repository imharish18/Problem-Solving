public class leetcode2337{
    public void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}