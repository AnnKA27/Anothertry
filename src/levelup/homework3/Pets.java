package levelup.homework3;

public class Pets {
     String typeofanimal;
     String name;
     double weight;
     int age;

    Pets ( String name, String typeofanimal) {
        this.name = name;
        this.typeofanimal = typeofanimal;
    }

   public  void  tobark ( String typeofanimal, double weight)  {
        if (weight >10) {
            System.out.println( "Гав-гав");

        }
   }
   public double getcurrentweight ( double weight) {
        return weight;
   }


}
