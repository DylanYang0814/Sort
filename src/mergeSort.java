//Dylan Yang APCS Java Period 2-3
public class mergeSort {

    /**
     * creates the necessary temporary array and calls the mergeSortHelper.
     * @param elements
     */
    public static void mergeSort(int[] elements) {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }
    /**
     * Sort an array of integers into ascending order.
     *
     * @param elements an array containing the items to be sorted.
     *
     * Postcondition: elements contains its original items and items in elements
     * are sorted in ascending order.
     */
    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp) {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    /**
     * This method takes 2 arrays that have already been sorted and compares the first items, compare and copies them to the temp araay
     * Temp array gets copied back eventually.
     * @param elements
     * @param from
     * @param mid
     * @param to
     * @param temp
     * Sorts elements[from] ... elements[to] inclusive into ascending order.
     *
     * @param elements an array containing the items to be sorted.
     * @param from the beginning index of the items in elements to be sorted.
     * @param to the ending index of the items in elements to be sorted.
     * @param temp a temporary array to use during the merge process.
     *
     * Precondition:
     * (elements.length == 0 or
     * 0 <= from <= to <= elements.length) and
     * elements.length == temp.length
     * Postcondition: elements contains its original items and the items in elements
     * [from] ... <= elements[to] are sorted in ascending order.
     */
    private static void merge(int[] elements, int from, int mid, int to, int[] temp) {
        int a = from;
        int b = mid + 1;
        int c = from;

        while (a <= mid && b <= to) {
            if (elements[a] < elements[b]) {
                temp[c] = elements[a];
                a++;
            } else {
                temp[c] = elements[b];
                b++;
            }
            c++;
        }
        while (a <= mid) {
            temp[c] = elements[a];
            a++;
            c++;
        }
        while (b <= to) {
            temp[c] = elements[b];
            b++;
            c++;
        }
        for (c = from; c <= to; c++) {
            elements[c] = temp[c];
        }
    }
}