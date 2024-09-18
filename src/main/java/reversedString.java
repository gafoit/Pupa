public class reversedString {
    public static void main(String[] args) {
        String a = "Make Install";
        StringBuilder b = new StringBuilder();
        for (int i = 0;i<a.length();i++)
        {
            b.append(a.charAt(a.length() - 1 - i));
        }
        System.out.println(b);
    }
}
