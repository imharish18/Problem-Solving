import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        System.out.print("Enter the size of the triangle: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<=n-(i+1); j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}