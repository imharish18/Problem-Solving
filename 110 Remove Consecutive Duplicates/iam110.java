public class iam110 {
        public static void removeDuplicates(int val, Stack st){
        while(val!=0){
            if(st.isEmpty()){
                st.push(val%10);
                val=val/10;
            }
            else if(st.peek()!=val%10){
                st.push(val%10);
                val=val/10;
            }
            else{
                st.pop();
                val=val/10;
            }
        }
        System.out.println(st);
    }
}
