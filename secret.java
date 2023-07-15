class newThread extends Thread{
	void print(char ch[]) {
		try {
			for(int i=0;i<=17;i++) {
				System.out.print(ch[i]);
				Thread.sleep(500);
			}
		}
		catch(Exception ex) {
			System.out.println();
		}
	}
}
public class secret {
	public static void  main(String[]args) {
		char ch[] = {73,32,76,79,86,69,32,85,32,77,79,78,65,76,73,83,65};
		newThread t1 = new newThread();
		t1.print(ch);
	}
	

}
