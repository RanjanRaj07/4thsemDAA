import java.util.Scanner;
public class Dknapsack {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Dknapsack ks = new Dknapsack();
		System.out.println("enter the number of elements");
		int n = sc.nextInt();
		int wt[] = new int[n+1];
		int val[] = new int[n+1];
		System.out.println("enter the weight of"+n+"elements");
		for(int i=1;i<=n;i++)
			wt[i]=sc.nextInt();
		System.out.println("enter the values of"+n+"elements");
		for(int i=1;i<=n;i++)
			val[i]=sc.nextInt();
		System.out.println("enter the knapsack capasity");
		int w = sc.nextInt();
		ks.solve(wt,val,w,n);
		sc.close();
	}
	public void solve(int []wt,int []val,int w,int n) {
		int i,j;
		int [][]v = new int [n+1][w+1];
		for(i=0;i<=n;i++) {
			for(j=0;j<=w;j++) {
				if(i==0||j==0)
					v[i][j]=0;
				else if(wt[i]>j)
					v[i][j]=v[i-1][j];
				else
					v[i][j]=Math.max((v[i-1][j]), (v[i-1][j-wt[i]]+val[i]));
			}
		}
		System.out.println("the optimal solution"+v[n][w]);
		int selected[] = new int[n+1];
		for(i=0;i<n+1;i++)
			selected[i]=0;
		j=w;
		i=n;
		while(i>0&&j>0) {
			if(v[i][j]!=v[i-1][j]) {
				selected[i]=1;
				j=j-wt[i];
			}
			i--;
		}
		System.out.println("\n item selected :");
		for(i=0;i<n+1;i++)
			if(selected[i]==1)
				System.out.print(i+" ");
		System.out.println();
	}
}
