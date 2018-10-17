public class Homework_2_task3 {
    public static void main(String args[]) {
        int i = (int) (Math.random() * 151) + 5;
        if (i > 25 && i < 100) {
            System.out.println("Число " + i + " находится в интервале (25,100)");
        } else {
            System.out.println("Число " + i + " не находится  в интервале (25,100)");

        }
    }
}

