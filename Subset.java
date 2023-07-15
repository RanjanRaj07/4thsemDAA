import java.util.Scanner;
public class Subset {
	public static void main(String[]args) {
		int a[] = new int[10];
		int x[] = new int[10];
		int n,d,sum,present=0;
		int j;
		System.out.println("enter the number of element of set");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("enter the elements of the set");
		for(int i=1;i<=n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter the positive integer sum");
		d=sc.nextInt();
		if(d>0) {
			for(int i=1;i<=Math.pow(2,n)-1;i++) {
				Subset s = new Subset();
				s.subset(i,n,x);
				sum=0;
				for(j=1;j<=n;j++)
					if(x[j]==1)
						sum=sum+a[j];
				if(d==sum) {
					System.out.print("subset = ");
					present = 1;
					for(j=1;j<=n;j++)
						if(x[j]==1)
							System.out.print(a[j]+" ");
				}
			}
			System.out.println();
		}
		if(present==0)
			System.out.println("solution does not exist");
		sc.close();
	}
	void subset(int num,int n,int x[]) {
		int i;
		for(i=1;i<=n;i++)
			x[i]=0;
		for(i=n;num!=0;i--) {
			x[i]=num%2;
			num=num/2;
		}
	}
}
