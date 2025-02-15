package pratica.loops;

import java.util.Scanner;

public class RevisaoDeEstruturas {
    public static void main(String[] args) {
        //ex01();
        //ex02();
        ex03();
    }

    public static void ex01() {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
    }

    public static void ex02() {
        int i = 0;
        while (i < 5) {
            System.out.println("Repetição " + i);
            i++;
        }
    }

    public static void ex03() {
        int i = 0;
        do {
            System.out.println("Repetição " + i);
            i++;
        } while (i < 5);
    }
}
