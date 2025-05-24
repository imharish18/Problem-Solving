class app{
    public static int pow(int a, int b) {
        if(b==0) return 1;
        else if(b==1) return a;
        else if(b%2==0){
            int ans = pow(a,b/2);
            return ans*ans;
        }else{
            int ans = pow(a,b/2);
            return ans*ans*a;
        }

    }
    public static void main(String[] args){
        System.out.println(pow(2,7));
    }
} 