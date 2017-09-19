
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		if (quickSort(a, 0, a.length - 1)) {
			return;
		}
	}	
	
	public boolean quickSort(int[] a, int top, int bot) {
		if (top >= bot) {
			return true;
		}
		
		int pivot = a[top];
		int i = top + 1;
		int j = bot;
		while (i < j) {
			while (i < j && a[i] <= pivot)
				i++;
			while (top < j && a[j] >= pivot)
				j--;
			
			if (i < j) {
				// swap a[i] and a[j]
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		if (pivot > a[j]) {
			// swap a[j] and pivot (a[top])
			a[top] = a[j];
			a[j] = pivot;
		}
		return quickSort(a, top, j - 1) && quickSort(a, j + 1, bot);

	}

}
