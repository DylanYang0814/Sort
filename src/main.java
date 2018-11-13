public class main {

    public static void main(String[] args) {

        int[] array = new int[10000];
        for (int y = 0; y<array.length;y++)
        {
            int num = (int)Math.random()*100;
            array[y] = num;
        }
    }
}
