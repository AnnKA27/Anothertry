public class Homework_2_task_4 {
    public static void main(String args[]) {
        int i = (int) (Math.random() * 900) + 100;
        int a = i % 10; // это вычислили единицы остатком деления на 10
        int b = (i / 10) % 10;
        int c = (i / 100) % 10;
        if (b >= c && b > a || b > c && b >= a) {
            System.out.println("В введенном трехзначном числе  " + i + " наибольшая цифра равна  " + b);
        } else {
            if (c > b && c >= a) {
                System.out.println("В введенном трехзначном числе  " + i + " наибольшая цифра равна  " + c);
            } else {
                System.out.println("В введенном трехзначном числе  " + i + " наибольшая цифра равна  " + a);
            }
        }
    }
}

