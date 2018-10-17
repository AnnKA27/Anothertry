import java.util.Scanner;

public class Homework_2_Task_5 {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите 3 любых целых числа: ");
        int a = k.nextInt();
        int b = k.nextInt();
        int c = k.nextInt();
        if (a >= b && a >= c) {
            if (b >= c) System.out.println("Возрастающая последовательность " + c + " " + b + " " + a);
            else System.out.println(" Возрастающая последовательность " + b + " " + c + " " + a);
        }
        if (b >= a && b >= c) {
            if (a >= c) System.out.println("Возрастающая последовательность " + c + " " + a + " " + b);
            else System.out.println(" Возрастающая последовательность " + a + " " + c + " " + b);
        }
        if (c >= a && c >= b) {
            if (a >= b) System.out.println("Возрастающая последовательность " + b + " " + a + " " + c);
            else System.out.println(" Возрастающая последовательность " + a + " " + b + " " + c);
        }
    }
}
