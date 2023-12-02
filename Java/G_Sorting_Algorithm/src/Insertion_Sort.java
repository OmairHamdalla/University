import java.lang.reflect.Array;
import java.util.Random;

public class Insertion_Sort {

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		
		System.out.println("Sorted: ");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+", ");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[10000];
		Random rand = new Random();
		for (int i = 0; i < 10000; i++) {
			arr[i] = rand.nextInt(10000) + 1;
		}
		
		System.out.println("Original: ");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}

		long startTime = System.nanoTime();
		insertionSort(arr.clone());
		long insertionSortTime = System.nanoTime() - startTime;

		System.out.println("\nInsertion Sort time: " + insertionSortTime);
		
	}
}
