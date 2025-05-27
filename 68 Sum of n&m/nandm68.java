import java.util.*;;

public class nandm68 {
        public static int differenceOfSums(int n, int m) {
        int num1=0,num2=0;
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%m!=0){
                num1+=i;
                al1.add(i);
            } 
            if(i%m==0){
                al2.add(i);
                num2+=i;
            }
        }
        return num1-num2;
    }
    public static void main(String[] args) {
        System.out.println(differenceOfSums(10,3));
    }
}
