public class row {
    public static void main(String[] args) {
        System.out.println(ryad());
    }
    public static String ryad()
    {
        int n = 2;
        double s = 0;
        while (1. / (n * n + n - 1) > Math.pow(10, -6)) {
            s += (1. / (n * n + n - 1.));
            n++;
        }
        return "Сумма ряда: " + s + "\tКол-во слагаемых: " + n + "\t Последнее слагаемое: " + (1. / (n * n + n - 1.));
    }
}
