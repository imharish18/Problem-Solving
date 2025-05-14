import java.util.Scanner;

class divisibleByFive{
    public static void main(String[] args) {
        System.out.print("Enter the number you want to check: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x%5==0) {
            System.out.println("Yes it is divisible by 5!!");
        }else{
            System.out.println("No, its not divisible!!");
        }
    }
}