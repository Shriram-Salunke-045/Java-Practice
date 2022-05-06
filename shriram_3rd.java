import java .util.*;
class shriram_2nd
{

static void findOrderMRT(int []L,
						int n)
{
	
	Arrays.sort(L);

	System.out.print("Optimal order in which " +
			"programs are to be stored is: ");
	for (int i = 0; i < n; i++)
		System.out.print(L[i] + " ");
		System.out.println();

	double MRT = 0;
	for (int i = 0; i < n; i++)
	{
		int sum = 0;
		for (int j = 0; j <= i; j++)
			sum += L[j];
		MRT += sum;
	}
	MRT /= n;
	System.out.print( "Minimum Retrieval Time" +
					" of this order is " + MRT);
}

// Driver Code
public static void main (String[] args)
{
	int []L = { 2, 5, 4 };
	int n = L.length;
	findOrderMRT(L, n);
}
}