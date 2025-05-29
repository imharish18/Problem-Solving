import java.util.*;
public class i78m {
        public static boolean containsDuplicate(int[] ar) {
        int n = ar.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int a: ar){
            if(hs.contains(a)) return true;
            hs.add(a);
        }

        if(hs.size()!=n) return true;
        return false;
    }
}
