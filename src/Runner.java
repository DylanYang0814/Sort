//Dylan Yang APCS Java Period 2-3
public class Runner {

    public static void main(String[] args) {
        int[] intArray = InPlaceSorts.generateIntArr(100, 100);
        double[] doubleArray = InPlaceSorts.generateDoubleArr(100, 100);
        String[] stringArray = InPlaceSorts.randomStringArr(26,5);
        int[] intArrayForMerge = InPlaceSorts.generateIntArr(100,100);

        System.out.println("Unsorted Int Array \n" + java.util.Arrays.toString(intArray));
        long start = System.nanoTime();
        InPlaceSorts.insertionSort(intArray);
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Insertion sort took about : " + (time / 1000) + " Microseconds");
        System.out.println("Sorted Int Array \n" + java.util.Arrays.toString(intArray) + "\n");

        System.out.println("Unsorted Double Array \n" + java.util.Arrays.toString(doubleArray));
        start = System.nanoTime();
        InPlaceSorts.selectionSort(doubleArray);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Selection sort took about : " + (time / 1000) + " Microseconds");
        System.out.println("Sorted Double Array \n" + java.util.Arrays.toString(doubleArray) + "\n");

        System.out.println("Unsorted String Array \n" + java.util.Arrays.toString(stringArray));
        start = System.nanoTime();
        InPlaceSorts.bubbleSort(stringArray);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Selection sort took about : " + (time / 1000) + " Microseconds");
        System.out.println("Sorted String Array \n" + java.util.Arrays.toString(stringArray) + "\n");

        System.out.println("Unsorted Int Array \n" + java.util.Arrays.toString(intArrayForMerge));
        start = System.nanoTime();
        mergeSort.mergeSort(intArrayForMerge);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Merge sort took about : " + (time / 1000) + " Microseconds");
        System.out.println("Sorted Int Array using merge sort \n" + java.util.Arrays.toString(intArrayForMerge));
    }
}