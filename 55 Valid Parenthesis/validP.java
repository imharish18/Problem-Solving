import java.util.*;
class validP {
    public static boolean isValid(String s) {
        int n = s.length();
        if(n==1) return false;
        List<Character> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                al.add(s.charAt(i));
            }
            else if(s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']'){
                if(al.isEmpty()) return false;
                else{
                    int lastIDX = al.size()-1;
                    if(s.charAt(i)=='}'){if(al.get(lastIDX)=='{')al.remove(lastIDX);else return false;} 
                    if(s.charAt(i)==')'){if(al.get(lastIDX)=='(')al.remove(lastIDX);else return false;} 
                    if(s.charAt(i)==']'){if(al.get(lastIDX)=='[')al.remove(lastIDX);else return false;} 
                }
            }
            }
            System.out.println(al);
        if(al.size()!=0) return false;
        return true;  
    }
}
