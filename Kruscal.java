/*0 28 999 999 999 10 999
28 0 16 999 999 999 14
999 16 0 12 999 999 999
999 999 12 0 22 999 18
999 999 999 22 0 25 24
10 999 999 999 25 0 999
999 14 999 18 24 999 0*/
import java.util.Scanner;
public class Kruscal {
	int p[] = new int[10];
	public static void main(String [] args) {
		int cost[][] = new int[10][10];
		int i,j,n;
		System.out.println("enter the no of vertices");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter the weighted matrix");
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				cost[i][j]=sc.nextInt();
		Kruscal k = new Kruscal();
		k.krk(cost,n);
		sc.close();
	}
	void krk(int cost[][],int n) {
		int i,j,k,u=0,v=0,min=999,ne,mcost=0;
		int [][]t = new int[10][3];
		for(i=1;i<=n;i++)
			p[i]=-1;
		ne = 0;
		while(ne<n-1) {
			min = 999;
			for(i=1;i<=n;i++)
					for(j=i+1;j<=n;j++)
				if(cost[i][j]<min ) {
					min=cost[i][j];
					u=i;v=j;
				}
			if(min==9) break;
			j=find(u);  k=find(v);
			if(j!=k) {
				ne++;
				t[ne][1]=u; t[ne][2] =v;
				mcost= mcost+cost[u][v];
				union(j,k);
			}
			cost[u][v] = cost[v][u] = 999;
		}
		if(ne!=n-1)
			System.out.println("No spanning tree");
		else{
			System.out.println("spanning tree is");
			for(k=1;k<=n-1;k++)
			System.out.println(t[k][1]+","+t[k][2]+"-->"+cost[t[k][1]][t[k][2]]);
		System.out.println("min cost ="+mcost);
		}
	}
	int find(int i) {
		while(p[i]>=0)
			i=p[i];
		return i;
	}
	void union(int j,int k) {
		p[k]=j;
	}
}
