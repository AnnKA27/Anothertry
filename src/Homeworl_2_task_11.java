import java.util.Scanner;

public class Homeworl_2_task_11 {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите любое натуральное число: ");
        int n = k.nextInt();
        int i;
        if (n > 0) {
            System.out.println("Делителями числа " + n + " являются : ");
            for (i = n; i > 0; i--) {
                int j = n % i;
                if (j == 0) {
                    System.out.print( i + " ");
                }

            }

        } else {
            System.out.println("Введенное число не являетсяя натуральным ");
        }
    }
}
