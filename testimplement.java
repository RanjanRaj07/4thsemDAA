class test implements Runnable{
	public void run(){
		System.out.println("runnable class");
		
	}
}
public class testimplement {
	public static void main(String [] args) {
		test t = new test();
		t.run();
	}

}
