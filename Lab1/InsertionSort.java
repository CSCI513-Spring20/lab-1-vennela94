public class InsertionSort implements SortStrategy{
	public void getSortTime(long[] ar) {
		long startTime = System.currentTimeMillis();
		for (int i=1; i < ar.length; i++)
		   {
		      long index = ar[i];
		      int j = i;
		      while (j > 0 && ar[j-1] > index)
		      {
		           ar[j] = ar[j-1];
		           j--;
		      }
		      ar[j] = index;
		   } 
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Insertion sort time is "+totalTime+" Milliseconds");
	}
} 