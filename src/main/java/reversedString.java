public class reversedString {
    public static void main(String[] args) {
        String a = "Make Install";
        System.out.println(reverseString(a));
    }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = 0;i<str.length();i++)
        {
            reversed.append(str.charAt(str.length() - 1 - i));
        }
        return reversed.toString();
    }
}
