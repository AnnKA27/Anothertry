import java.util.Scanner;

public class Homework_2_task_2 {
        public static void main(String args[]) {
            Scanner k = new Scanner(System.in);
            System.out.println("Введите два любых числа: ");
            double number1 = k.nextInt();
            double number2 = k.nextInt();
            if (Math.abs(number1-10)> Math.abs(number2-10)) {
                System.out.println("Ближайщее к десяти число равно " + number2);
            }
            if (Math.abs(number2-10)> Math.abs(number1-10)) {
                System.out.println("Ближайщее к десяти число равно " + number1);
            }
            else {
                System.out.println("Числа равны и одинаково близко находятся к 10");
            }

            }
}
