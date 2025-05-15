import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int resNum = num;
        int sum = 0;
        while (num!=0) {
            sum+=num%10;
            num=num/10;
        }
        System.out.println("The Sum of the digits of the "+resNum+" = "+sum);
    }
}
