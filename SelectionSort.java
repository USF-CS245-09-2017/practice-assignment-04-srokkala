
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) 
	{
		// TODO Auto-generated method stub
		int length =  a.length;
		for(int i =0; i < length-1; i++)
		{
			int index = i;	//index where the minimum is 
			for(int z = i + 1; z < length; z++ )
			{
				if(a[z] < a[index])
				{
					index = z;
				}
			}
			int temp =  a[index];		//creating a temp variable to switch values
			a[index] = a[i];
			a[i]= temp;
		}


	}

}
