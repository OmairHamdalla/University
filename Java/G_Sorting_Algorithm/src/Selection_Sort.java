import java.util.Random;

public class Selection_Sort {

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
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
		selectionSort(arr.clone());
		long selectionSortTime = System.nanoTime() - startTime;


		
		System.out.println("Selection Sort time: " + selectionSortTime);
	}
}
