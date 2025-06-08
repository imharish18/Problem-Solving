import java.util.ArrayList;
import java.util.Collections;

public class solving {
    public static void main(String[] args) {
        int n=12;
        ArrayList<String> asl = new ArrayList<>();
        for(int i=1; i<=n; i++){
            asl.add(i+"");
        }
        System.out.println(asl);
        Collections.sort(asl);
        System.out.println(asl);
        ArrayList<Integer> intList = new ArrayList<>();
        for (String s : asl) {
            intList.add(Integer.parseInt(s));
        }
    }
}
