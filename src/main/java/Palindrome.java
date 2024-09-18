public class Palindrome {
    public static void main(String[] args) {
        String[] seq = {"101","11","5151"};
        for (String s : seq) {
            System.out.println(isPalindrome(s));
        }

    }
    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
