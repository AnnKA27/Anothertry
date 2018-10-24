import java.util.Scanner;

public class Homework_2_task_12 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите любое натуральное число: ");
        int a = k.nextInt();
        for(int i=(int)Math.sqrt(a);i>=1;i--) {
            if (a % i == 0 & i != 1) {
                System.out.println("Введенное  число - составное");
                break;
            }
            if  (i == 1) {
                System.out.println("Введенное число - простое");
            }
        }

}
}











