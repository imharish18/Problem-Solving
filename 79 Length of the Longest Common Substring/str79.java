import java.util.*;
public class str79 {
        public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i=0;
        HashSet<Character> set = new HashSet<>();
        for(int j=0; j<s.length(); j++){
            char ch = s.charAt(j);

            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength, j-i+1);
        }
        return maxLength;
    }
}
