import java.util.Random;

public class Bubble_Sort {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
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
		bubbleSort(arr.clone());
		long bubbleSortTime = System.nanoTime() - startTime;
		
		System.out.println("Bubble Sort time: " + bubbleSortTime);
		
	}
}
