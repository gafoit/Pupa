import static java.lang.Math.sqrt;

public class Equation {
    public static void main(String[] args) {
        System.out.println(Quad(1,0,0));

    }
    public static String Quad(double a, double  b, double c)
    {
        if (a == 0) {
            return "x= " + (-c / b);
        } else {
            double D = b * b - (4 * a * c);
            if (D > 0) {
                return "x1 = " + (-b + sqrt(D)) / (2 * a) + "\tx2 = " + (-b - sqrt(D)) / (2 * a);
            } else if (D == 0) {
                return "x1 = x2 = " + -b / (2 * a);
            } else {
                return "Нет вещественных корней";
            }
        }
    }

}
