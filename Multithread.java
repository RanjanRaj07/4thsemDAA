import java.util.*;
public class Multithread {
	public static void main(String[]args) {
		try {
			Thread t1 = new Thread(new RandomThread());
			t1.start();
			int  num = 10;
			Thread t2 = new Thread(new Square(num));
			t2.start();
			Thread t3 = new Thread(new Cube(num));
			t3.start();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
class Cube implements Runnable{
	public int x;
	public Cube(int x) {
		this.x=x;
	}
	public void run() {
		System.out.println("from third thread cube of"+x+"is :"+x*x*x);
	}
}
class Square implements Runnable{
	public int x;
	public Square(int x) {
		this.x=x;
	}
	public void run() {
		System.out.println("from second Thread square of"+x+"is :"+x*x);
	}	
}
class RandomThread implements Runnable{
	public void run() {
		int num;
		Random r= new Random();
		try {
			for(int i=0;i<5;i++) {
				num = r.nextInt(100);
				System.out.println("First thread started and generated number is "+num);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
