package HomeWork8;

/**
 * Created by user on 16.11.2015.
 */
public class FloatArray {
    public static void main (String[] args){
        float[] array = {1.5f, 1.7f, 2.6f, 3.5f, 4.9f, 5.7f};
        float sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }
}
