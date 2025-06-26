import java.util.*;
import java.io.*;

class Nodee22 {
    public static final int val = 0;
    public static Nodee22 next = null;
    Nodee22 left;
    Nodee22 right;
    int data;
    
    Nodee22(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class hackerank {

	/* 
    
    class Nodee22 
    	int data;
    	Nodee22 left;
    	Nodee22 right;
	*/
    public static class Pair{
        Nodee22 node;
        int level;
        Pair(Nodee22 node, int level){
            this.node = node;
            this.level = level;
        }
    }
	public static void topView(Nodee22 root) {
      HashMap<Integer,Integer> map = new HashMap<>();
      Queue<Pair> q = new LinkedList<>();
      q.add(new Pair(root, 0));
      int minLevel = Integer.MAX_VALUE, maxLevel = Integer.MIN_VALUE;
      while(!q.isEmpty()){
        Pair temp = q.remove();
        Nodee22 node = temp.node;
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

	public static Nodee22 insert(Nodee22 root, int data) {
        if(root == null) {
            return new Nodee22(data);
        } else {
            Nodee22 cur;
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
        Nodee22 root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}