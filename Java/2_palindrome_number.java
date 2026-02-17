class PalindromeNumber {

    static void main(String[] args) {
        int x = 11211;
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome( int x) {
        char [] digits = String.valueOf(x).toCharArray();

        for (int i = 0; i < (digits.length/2); i++) {
            if (digits[i] != digits[digits.length-1-i]){
                return false;
            }
        }

        return true;
    }
}