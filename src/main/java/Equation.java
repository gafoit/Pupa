import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextInt();
        if (a == 0) {
            System.out.println("x= " + (-c / b));
        } else {
            float D = b * b - (4 * a * c);
            if (D > 0) {
                System.out.println("x1 = " + (-b + sqrt(D)) / (2 * a) + "\tx2 = " + (-b - sqrt(D)) / (2 * a));
            } else if (D == 0) {
                System.out.println("x1 = x2 = " + -b / (2 * a));
            } else {
                System.out.println("Нет вещественных корней");
            }
        }
    }
}
