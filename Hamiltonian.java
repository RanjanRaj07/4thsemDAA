/*0 1 1 1 0 0
1 0 1 0 0 1
1 1 0 1 1 0
1 0 1 0 1 0
0 0 1 1 0 1
0 1 0 0 1 0 Improper output check later*/
import java.util.Scanner;
public class Hamiltonian {
	int n,g[][],x[],i,j,k;
	public Hamiltonian(int n,int [][]g) {
		this.n=n;
		this.g=g;
		this.x=new int[n+1];
		x[1]=1;
	}
	public static void main(String[]args) {
		int n;
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the number of vertices:");
		n=sc.nextInt();
		int [][]g = new int[n+1][n+1];
		System.out.println("enter the matrix:");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
		    	g[i][j]=sc.nextInt();
		Hamiltonian ham = new Hamiltonian(n,g);
		ham.hamilton(2);
		sc.close();
	}
	public void hamilton(int k) {
		while(true) {
			nextvalue(k);
			if(x[k]==0) {
				return;
			}
			if(k==n) {
				System.out.println("solution :");
				for(int i=1;i<=n;i++)
					System.out.print(x[i]+"\t");
				System.out.println(1);
			}
			else
				hamilton(k+1);
		}
	}
	public void nextvalue(int k) {
		while(true){
			x[k]=(x[k]+1)%(n+1);
			if(x[k]==0) {
				return;
			}
			if(g[x[k-1]][x[k]]!=0) {
				for(j=1;j<=k-1;j++) {
					if(x[j]==x[k]) 
						break;
				}
			}
			if(j==k) {
				if((k<n)||((k==n)&&(g[x[n]][x[1]]!=0)))
					return;
			}
		}
	}

}
