import java.util.Scanner;

public class Homework_2_task_1 {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int number1 = k.nextInt();
        if (number1 % 2 == 0) {
            System.out.println("Введенное число является четным");
        } else {
            System.out.println("Введенное число не является четным");
        }
    }

}





