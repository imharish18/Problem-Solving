public class compression32 {
    public static int compress(char[] ar) {
        int i = 0, j = 0, idx = 0, n = ar.length;

        while (j < n) {
            if (ar[i] == ar[j]) {
                j++;
            } else {
                int len = j - i;
                ar[idx++] = ar[i]; // Add character

                if (len > 1) {
                    String countStr = Integer.toString(len);
                    for (int k = 0; k < countStr.length(); k++) {
                        ar[idx++] = countStr.charAt(k);
                    }
                }

                i = j;
            }
        }

        // Handle last group
        int len = j - i;
        ar[idx++] = ar[i];
        if (len > 1) {
            String countStr = Integer.toString(len);
            for (int k = 0; k < countStr.length(); k++) {
                ar[idx++] = countStr.charAt(k);
            }
        }

        return idx;
    }
    public static void main(String[] args) {
        char[] ar = {'a','a','a','a','a','a','a','b','b','b','b','b','c','c','d','d','d','d','d','d','d','d','d','d','d','d'};
        compress(ar);
    }   
}