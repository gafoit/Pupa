public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            System.out.println(i + ") " + fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int n) {
        if (n % 35 == 0) {
            return "FizzBuzz";
        } else if (n % 7 == 0) {
            return "Buzz";
        } else if (n % 5 == 0) {
            return "Fizz";
        } else {
            return "";
        }
    }
}
