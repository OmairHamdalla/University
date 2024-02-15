import java.util.Arrays;

public class Q6 {

  public static int[] reverseArray(int[] arr) {
    int[] newArr = new int[arr.length];

    for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
      newArr[j] = arr[i];
    }
    return newArr;
  }

  public static void main(String[] args) {
  	int[] numbers = {1, 5, 8, 3, 2, 9, 7};

    int[] reversedArr = reverseArray(numbers);

    System.out.println("Original array: " + Arrays.toString(numbers));
    System.out.println("Reversed array: " + Arrays.toString(reversedArr));
  }
}
