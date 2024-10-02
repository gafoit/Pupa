package laba2;

import java.util.Arrays;
import java.util.Random;

public class OddEvenSeparator {
    String Odd = "[";
    String Even = "[";

    public static void main(String[] args) {
        OddEvenSeparator oes = new OddEvenSeparator();
        Random rand = new Random();
        int[] test_arr = new int[10];
        for (int i = 0; i < test_arr.length; i++) {
            test_arr[i] = rand.nextInt(10) + 1;
        }
        System.out.println("Рандомный список:" + Arrays.toString(test_arr));

        for (int i : test_arr) {
            oes.addNumber(i);
        }

        oes.odd();
        oes.even();
    }

    public void addNumber(int num) {
        if (num % 2 == 0) {
            Even += num + ", ";
        } else {
            Odd += num + ", ";
        }
    }

    public void odd() {
        System.out.println("Нечетные: " + Odd.substring(0, Odd.length() - 2) + "]");
    }

    public void even() {
        System.out.println("Четные: " + Even.substring(0, Even.length() - 2) + "]");
    }

}
