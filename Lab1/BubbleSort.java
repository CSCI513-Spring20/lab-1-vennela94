public class BubbleSort implements SortStrategy{
	public void getSortTime(long[] ar) {
		long startTime = System.currentTimeMillis();
		for (int i = (ar.length - 1); i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
			if (ar[j-1] > ar[j]) {
			long temp = ar[j-1]; ar[j-1] = ar[j]; ar[j] = temp;
			} }
			}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Bubblesort time is "+totalTime+" Milliseconds");
	}
} 