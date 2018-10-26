package levelup.homework3;

public class ArrayUtil {

    public int getMinValueinArray (int[] array) {
        int minValue = array [0];
        for ( int j=1; j <array.length; j++) {
            if (array [j] < minValue) {
                minValue = array[ j];
                System.out.println( "Минимальный элемент массива равен = "+ minValue);
            }
        }
        return minValue;
    }

    public int getMaxValueinArray (int[] array) {
        int maxValue = array [0];
        for ( int j=1; j <array.length; j++) {
            if (array [j] > maxValue) {
                maxValue = array[ j];
                System.out.println( "Максимальный  элемент массива равен = "+ maxValue);
            }
        }
        return maxValue;
    }

}
