public class LargestPalindrome {
    public static boolean verifyPalindrome(int n) {
        String check = Integer.toString(n);
        for(int i = 0; i < check.length() / 2; i++) {
            if(!check.substring(i, i + 1).equals(check.substring(check.length()-1-i, check.length()-i)))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        for(int i = 999; i >= 100 ; i--) {
            for(int n = 999; n >= 100; n--) {
                if(verifyPalindrome(i*n))
                System.out.println(i*n);
            }
        }
    }
}
        