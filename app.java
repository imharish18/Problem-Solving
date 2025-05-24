class app{
    public static int faxt(int n) {
        if(n<=1)return 1;
        else return n*faxt(n-1);
    }
    public static void main(String[] args){
        System.out.println(faxt(5));
    }
} 