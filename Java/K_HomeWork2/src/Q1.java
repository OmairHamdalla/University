import java.util.Arrays;
public class Q1 {

    public static void main(String[] args) {
        int[] numericArray = {5, 2, 8, 1, 6, 3};
        String[] stringArray = {"trabzon", "hatay", "izmir", "bursa", "ankara", "rize"};
        
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray) + "\nOriginal String Array: " + Arrays.toString(stringArray));
        sort(numericArray);
        sort(stringArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray) + "Sorted String Array: " + Arrays.toString(stringArray));
    }

    private static void sort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++)
            for (int j = 0; j < len - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    private static void sort(String[] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++)
            for (int j = 0; j < len - i - 1; j++)
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
