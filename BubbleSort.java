
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) 
	{
		// TODO Auto-generated method stub
		int length = a.length;
		for(int i =0; i < length-1 ; i++)
		{
			for(int z = 0; z < length-i-1; z++)
			{
				if(a[z] > a[z+1])
				{
					int temp = a[z];			//creating a temp variable to switch 
					a[z] = a[z+1];
					a[z+1] = temp;			
				}
			}
		}

	}
}
