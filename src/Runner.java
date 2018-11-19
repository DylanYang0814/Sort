//Dylan Yabg APCS Java Period 2-3
public class Runner {

    public static void main(String[] args) {
        int[] intArray = InPlaceSorts.generateIntArr(100, 100);
        double[] doubleArray = InPlaceSorts.generateDoubleArr(100, 100);
        String[] stringArray = {"Toothpick", "Brush", "Water", "Apple"};

        System.out.println("Unsorted Int Array \n" + java.util.Arrays.toString(intArray));
        InPlaceSorts.insertionSort(intArray);
        System.out.println("Sorted Int Array \n" + java.util.Arrays.toString(intArray));

        System.out.println("Unsorted Double Array \n" + java.util.Arrays.toString(doubleArray));
        InPlaceSorts.selectionSort(doubleArray);
        System.out.println("Sorted Double Array \n" + java.util.Arrays.toString(doubleArray));

        System.out.println("Unsorted String Array \n" + java.util.Arrays.toString(stringArray));
        InPlaceSorts.bubbleSort(stringArray);
        System.out.println("Sorted String Array \n" + java.util.Arrays.toString(stringArray));
    }
}