public class BubbleSort {

    public BubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i + 1] = array[1];
                array[i] = temp;
            }
        }
    }
}
