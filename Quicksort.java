import java.util.*;
public class Quicksort {
	public static void main(String[]args) {
		Random r = new Random();
		System.out.println("enter the no of elements:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(100);
		System.out.println("elements befor sort:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		double t1 = System.nanoTime();
		quicksort(a,0,n-1);
		double t2 = System.nanoTime();
		System.out.println("enter after sort:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		System.out.println(t2-t1);
		sc.close();
	}
	public static int partion(int a[],int low,int high) {
		int i=low,j=high+1,temp;
		int pivote=a[low];
		while(i<j) {
			do {
				i++;
			}while(pivote>=a[i]&&i<high);
			do {
				j--;
			}while(pivote<a[j]);
			if(i<j) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp=a[j];
		a[j]=a[low];
		a[low]=temp;
		return j;
	}
	public static void quicksort(int a[],int low,int high) {
		if(low<high) {
			int j =partion(a,low,high);
			quicksort(a,low,j-1);
			quicksort(a,j+1,high);
		}
	}
}
