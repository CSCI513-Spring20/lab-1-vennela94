public class SelectionSort implements SortStrategy{
	public void getSortTime(long[] ar) {
		long startTime = System.currentTimeMillis();
		System.out.println("Length is "+ar.length);
		for (int i = 0; i < ar.length-1; i++) {
			int min = i;
			for (int j = i+1; j < ar.length; j++)
			if (ar[j] < ar[min]) min = j;
			long temp = ar[i];
			ar[i] = ar[min];
			ar[min] = temp;
			}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Selectionsort time is "+totalTime+" Milliseconds");
	}
} 


