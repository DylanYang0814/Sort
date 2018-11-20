//Dylan Yang APCS Java Period 2-3
public class mergeSort {

    public static void mergeSort(int[] elements) {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }

    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp) {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

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