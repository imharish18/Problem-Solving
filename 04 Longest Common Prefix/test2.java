class sol {
     public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int index = 0;
        String prefix = "";
        boolean conditionSatisfaction = true;

        while (conditionSatisfaction) {
            if (index >= strs[0].length()) break; 

            char stored = strs[0].charAt(index); 

            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || strs[i].charAt(index) != stored) {
                    conditionSatisfaction = false;
                    break;
                }
            }

            if (conditionSatisfaction) {
                prefix += stored;
            }

            index++;
        }

        return prefix;
    }
}
public class test2{
    public static void main(String[] args) {
        sol s = new sol();
        String[] strs = {"flower","flow","flight"};
        System.out.println(s.longestCommonPrefix(strs));
    }
}