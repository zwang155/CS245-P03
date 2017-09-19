
public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		merge(a, 0, a.length - 1);
	}
	
	
	public void merge(int[] a, int top, int bot) {
		if (top >= bot)
			return;
		
		int mid = (top + bot) / 2;
		merge(a, top, mid);
		merge(a, mid + 1, bot);
		
		int[] temp = new int[bot - top + 1];
		int i = top;
		int j = mid + 1;
		for (int k = 0; k < temp.length; k++) {
			if (i > mid)
				temp[k] = a[j++];
			else if (j > bot)
				temp[k] = a[i++];
			else if (a[j] < a[i])
				temp[k] = a[j++];
			else
				temp[k] = a[i++];
		}
		for (int k = 0; k < temp.length; k++)
			a[k + top] = temp[k];
	}

}
