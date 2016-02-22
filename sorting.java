package quicksort;

public class sorting {

	public static void main(String[] args) {
		int a[] = {24,2,45,20,56,75,5,56,99,53,12};
		for(int i:a)
		{
			System.out.print(i);
            System.out.print(" ");
		}
		
		System.out.println("After Sorting:");
		sorting s = new sorting();
		s.quicksort(a);
		for(int i:a)
		{
			System.out.print(i);
            System.out.print(" ");
		}
	}
	
	public void quicksort(int [] a)
	{
		recquicksort(a,0,a.length-1);
	}

	public void recquicksort(int [] a, int lo , int upper)
	{
		int pivot; 
		if(lo < upper)
		{
			pivot = partition(a,lo,upper);
			recquicksort(a,lo,pivot-1);
			recquicksort(a,pivot+1,upper);
		}
	}
	public int partition(int[] a , int lo , int upper)
	{
		int pivot, index,smallindex,temp;
		
		int mid = (lo+upper)/2;
		
		temp = a[mid];
		a[mid] = a[lo];
		a[lo] = temp;
		
		pivot = a[lo];
		smallindex = lo;
		
		for(index = lo+1; index <= upper; index++)
		{
			if(a[index] < pivot )
			{
				smallindex++;
				
				
				temp = a[index];
				a[index] = a[smallindex];
				a[smallindex] = temp;	
			}
		}
		temp = a[lo];
		a[lo] = a[smallindex];
		a[smallindex] = temp;
		
		return smallindex;
	}
}
