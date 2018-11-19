//Dylan Yang APCS Java Period 2-3
public class InPlaceSorts {
    /**
     * This method swapCount 2 double in the double array arr
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swapDouble(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * This is the same method as above but swapCount 2 String
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swapArr(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * this method generates a random array of int from the given param count and range
     *
     * @param count
     * @return
     */
    public static int[] generateIntArr(int count, int range) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range);
        }
        return arr;
    }

    /**
     * This method generates a random array of doubles with the param count and range
     *
     * @param count
     * @param range
     * @return
     */
    public static double[] generateDoubleArr(int count, int range) {
        double[] arr = new double[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * range;
        }
        return arr;
    }

    /**
     * The insertion takes each element from the array, and adds it to the front of the array in the correct order.
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int index = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > index) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = index;
        }
    }

    /**
     * The selection sort compares 2 and if one is less than the other it will be moved to the front
     * @param arr
     */
    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            double min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    swapDouble(arr, i, j);
                }
            }
        }
    }

    /**
     * Bubble sort compares 2 items and if the compareTo method compares the first letter and if its out of order they swap.
     * @param arr
     */
    public static void bubbleSort(String[] arr) {
        int swapCount = 1;
        while (swapCount != 0) {
            swapCount = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swapArr(arr, i, i + 1);
                    swapCount++;
                }
            }
        }
    }
}
