
class Solution1927 {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

        public static void main(String[] args) {
        System.out.println(Solution1927.isPalindrome(12321));
        System.out.println(Solution1927.isPalindrome(12311));
    }
}