
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) 
	{
		// TODO Auto-generated method stub
		int length = a.length;
		for(int i = 1; i < length; ++i)
		{
			int temp = a[i];
			int z = i-1;
			while(z>= 0 && a[z] > temp)
			{
				a[z+1] =  a[z];
				z--;
			}
			a[z+1] = temp;
		}
	}
}
