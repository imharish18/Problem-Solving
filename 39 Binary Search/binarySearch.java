public class binarySearch {
    public static void bSearch(int[] ar, int lo, int hi, int target) {
        boolean flag = false;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(ar[mid]==target){
                flag = true;
                System.out.println("found");
            }
            if(ar[mid]>target){
                System.out.println("Left from: "+ar[mid]);
                hi=mid-1;
                
            }else{
                System.out.println("Right from: "+ar[mid]);
                lo=mid+1;
            }

        }
        if(flag==true){
            System.out.println("We found");
        }
        else{System.out.println("Not Found");}
    }
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        for(int e : ar){
            System.out.print(e+" ");
        }

        System.out.println("------------------------------");
        
        bSearch(ar, 0, ar.length-1,target);

    }  

}

