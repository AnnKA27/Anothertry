import com.sun.javafx.image.BytePixelSetter;

import java.util.Scanner;

public class Homework_2_task_10 {
    public static void main(String args[]) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите любое натуральное число n: ");
        int n = k.nextInt();
        long b = 1;
        int i;
        if (n >= 0) {
            {
                for (i = 1; i <= n; i++) {
                    b = b * i;
                }
            }
            System.out.println("Факториал числа n равен  " + b);
        } else {
            System.out.println("Введенное число является отрицательным, у отрицательных чисел не бывает факториала");

        }
    }


}





