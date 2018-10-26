package levelup.homework3;

public class Testpets {
    public static void main(String[] args) {
        Pets [] animal = new Pets [3];
        animal [0] = new Pets(" Сэм", "Кот");
        animal [1] = new Pets(" Грета", "Собака");
        animal [2] = new Pets(" Джесси", "Попугай");
        System.out.println( animal[0].typeofanimal + " - " + animal[0].name );
        System.out.println( animal[1].typeofanimal + " - " + animal[1].name );
        System.out.println( animal[2].typeofanimal + " - " + animal[2].name );

    }







}
