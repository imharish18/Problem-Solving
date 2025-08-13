import java.util.*;

public class power {

    public static void main(String[] args) {
        String[] s = {"/c","/d/c/e"};
        System.out.println(s[0].indexOf("/c"));
        Arrays.sort(s);
        ArrayList<String> al = new ArrayList<>();
        for(String a : s){
            if(al.isEmpty()) al.add(a);
            else{
                String lastString = al.get(al.size()-1);
                if(!a.startsWith(lastString)) al.add(a); 
                }
            
        }
        System.out.println(al);
    }
}
