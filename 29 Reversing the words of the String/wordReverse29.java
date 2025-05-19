import java.util.*;


public class wordReverse29 { 
    public static void reverseFX(StringBuilder sb, int i,int j){
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();

        int i=0, j=0;

        while(j<n){
            if(sb.charAt(i)==' ' || sb.charAt(i)=='.'){
                i++;
                j++;
            }
            if(sb.charAt(j)!=' ') j++;
            else{
                reverseFX(sb, i, j-1);
                i=j+1;
                j=i;
            }
        }
        if(j==n){
            reverseFX(sb, i, j-1);
        }
        
        System.out.println(sb);
    }
}


