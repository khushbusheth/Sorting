package mergesort;

public class sort {

	public static void main(String[] args) {
		
		int[] inp ={45,23,11,89,77,98,4,28,65,43};
		for(int i:inp)
		{
			System.out.print(i);
            System.out.print(" ");
		}
		System.out.println("After Sorting:");
		sort s = new sort();
		inp = s.mergesort(inp);
		for(int i:inp)
		{
			System.out.print(i);
            System.out.print(" ");
		}
		
	}

	public int[] mergesort(int a[])
	{
		if(a.length<=1)
		{
			return a;
		}
		else
		{
			int [] f = new int[a.length/2];
			int [] s = new int[a.length-f.length];
			System.arraycopy(a,0,f,0,f.length);
			System.arraycopy(a,f.length,s,0, s.length);
			mergesort(f);
			mergesort(s);
			merge(f,s,a);
			return a;
		}
	}
	
	public void merge(int f[],int s[], int r[])
	{
		int inf=0;
		int is=0;
		int j=0;
		while(inf<f.length && is<s.length)
		{
			if(f[inf]<s[is])
			{
				r[j]=f[inf];
				inf++;
			}
			else
			{
				r[j] = s[is];
				is++;
			}
			j++;
		}
		System.arraycopy(f,inf, r,j,f.length-inf);
		System.arraycopy(s,is, r,j,s.length-is);
		
	}
}
