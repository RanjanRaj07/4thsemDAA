import java.util.Scanner;
public class Gknapsack {
	public static void main(String[]args) {
		int n;
		Scanner s = new Scanner(System.in); 
		System.out.println("enter the number of objects");
		n=s.nextInt();
		double []p =new double[n];
		double []w = new double[n];
		int i;
		System.out.println("enter the capacity of knapsack");
		double m = s.nextDouble();
		System.out.println("enter the profit of "+n+" objects");
		for(i=0;i<n;i++)
			p[i]=s.nextDouble();
		System.out.println("enter the weight of "+n+" objects");
		for(i=0;i<n;i++)
			w[i]=s.nextDouble();
		s.close();
		Kpgreedy gk = new Kpgreedy(n,m,p,w) ;
		gk.compute();
	}
}
class Kpgreedy{
	int n;
	double m,p[],w[];
	public Kpgreedy(int n,double m,double p[],double w[]) {
		this.n=n;
		this.m=m;
		this.p=p;
		this.w=w;
	}
	void compute() {
		int i;
		double []x = new double[n];
		for(i=0;i<n;i++)
			x[i]=0.0;
		double rc = m;
		for(i=0;i<n;i++) {
			if(w[i]>rc) break;
			x[i] = 1;
			rc = rc-w[i];
		}
		if(i<n) x[i]=rc/w[i];
		double netprofit = 0.0;
		for(i=0;i<n;i++) {
			if(x[i]>0.0)
				netprofit+=x[i]*p[i];
		}
		System.out.println("Netprofit is"+netprofit);
		System.out.println("the objects picked up into knapsack are:");
		for(i=0;i<n;i++)
			System.out.print(x[i]+"  ");
			
	}
}