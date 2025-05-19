import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class neww26 { 
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to enter: ");
        String s = sc.nextLine();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(isVowel(s.charAt(i))==true){
                count++;
            }
        }
        System.out.println("The total no of the vowels in the Strind is "+count);
    }
}
