class app{
    public static int stairs(int n) {
        if(n==0) return 0;
        if(n==2) return 2;
        else return stairs(n-1)+stairs(n-2);
    }
    public static void main(String[] args){
        System.out.println(stairs(5));
    }
} 