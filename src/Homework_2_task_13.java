public class Homework_2_task_13 {

    public static void main(String[] args){
    int x=1;
    int y= 1;
    int z=0;
    System.out.print ( z + " " + x + " " + y + " "  );
        for(int i=4;i<=11;i++){
            z =  x + y ;
            x = y ;
            y = z;
            System.out.print( z +" ");
        }
    }
}


