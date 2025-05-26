class trike{
    public static void printBinary(int a, String ans){
        if(ans.length()==a){
            System.out.println(ans);
            return;
        }
        if(ans.length()>0 && ans.charAt(ans.length()-1)=='1'){
            printBinary(a, ans+'0');
        }else{
            printBinary(a, ans+'1');
            printBinary(a, ans+'0');
        }
    }
    public static void main(String[] args) {
        printBinary(3,"");
    }
} 