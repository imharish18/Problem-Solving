import java.util.*;
public class iam196 {
    class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<order.length(); i++) map.put(order.charAt(i),i);
        
        for(int i=0; i<words.length-1; i++){
            String word1 = words[i];
            String word2 = words[i+1];
            boolean workFlow = true;
            for(int k=0; k<Math.min(word1.length(), word2.length()); k++){
                char char1 = word1.charAt(k);
                char char2 = word2.charAt(k);
                if(map.get(char1)<map.get(char2)){ 
                    workFlow = false;
                    break;
                }
                else if(map.get(char1)==map.get(char2)) continue;
                else return false;                    
            }
            if(workFlow && word1.length()>word2.length()) return false;
        }
        return true;
    }
}
}
