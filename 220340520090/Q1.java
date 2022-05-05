import java.util.Scanner;

class Q1
{

 void insertionSort1(int a1[],int n)
{
System.out.println(n+" size");
	for(int i=n-2;i>=0;i--)
	{
		int j=0;
		int temp = a1[i+1];
		for( j =i;j>=0 && a1[j]>temp;j--)
		{
			a1[j+1]=a1[j];
			
		for(int k=0;k<n;k++)
		{
		System.out.print(a1[k]+" ");
		}
		
			System.out.println("");
		}
			
			a1[j+1]=temp;
			
			}
			for(int k=0;k<n;k++)
			{
			System.out.print(a1[k]+" ");
			}
			System.out.println("");
 }
	
	public static void main(String args[])
	{
		Q1 q = new Q1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size ");
		int n = sc.nextInt();
		int a1[]= new int[n];
		System.out.println("Enter your array values ");
		for(int i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}	
		q.insertionSort1(a1,n);
		
	}
}
