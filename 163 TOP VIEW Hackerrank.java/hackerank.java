import java.util.*;
import java.io.*;

class Node {
    public static final int val = 0;
    public static Node next = null;
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class hackerank {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
	public static void topView(Node root) {
      HashMap<Integer,Integer> map = new HashMap<>();
      Queue<Pair> q = new LinkedList<>();
      q.add(new Pair(root, 0));
      int minLevel = Integer.MAX_VALUE, maxLevel = Integer.MIN_VALUE;
      while(!q.isEmpty()){
        Pair temp = q.remove();
        Node node = temp.node;
        int level = temp.level;
        minLevel = Math.min(minLevel, level);
        maxLevel = Math.max(maxLevel, level);
        if(!map.containsKey(level)){
            map.put(level,node.data);
        }
        if(node.left!=null) q.add(new Pair(node.left, level-1));
        if(node.right!=null) q.add(new Pair(node.right, level+1));
      }
      for(int i=minLevel; i<=maxLevel; i++){
        System.out.print(map.get(i)+" ");
      }
      
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}