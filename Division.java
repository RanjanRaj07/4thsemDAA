import java.util.Scanner;
public class Division {
	public static void main(String[]args) {
		int a,b,c;
		System.out.println("enter the numerator");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		System.out.println("enter the denominator");
		b = s.nextInt();
		try {
			c = a/b;
			System.out.println("quotient="+c);
		}
		catch(ArithmeticException ae){
			System.out.println("denominator 0 error");
		}
		s.close();
	}

}
