
public class alivejoin {

	public static void main(String[] args) {
		A obj = new A();
		obj.start();
		System.out.println("thread alive :"+obj.isAlive());
		try {
		if(obj.isAlive())
			obj.join();
		}
		catch(Exception e) {
			
		}
		System.out.println("main thread exiting");	
	}
}
class A extends Thread
{
	public void run() {
		for(int i=0;i<4;i++)
			System.out.println("thread running"+i);
	}
}
