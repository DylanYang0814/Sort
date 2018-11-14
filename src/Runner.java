import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        int[] array = new int[10000];
        for (int y = 0; y < array.length; y++) {
            int num = (int) (Math.random() * 10000);
            array[y] = num;
        }
        System.out.println(Arrays.toString(array));
    }
}
