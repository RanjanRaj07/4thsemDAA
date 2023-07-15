import java.util.Scanner;
class Stack{
	int a[],top;
	public Stack(int n) {
		a =new int[n];
		top=-1;
	}
	void push(int item) {
		if(top==a.length-1)
			System.out.println("stack overflow");
		else {
			a[++top]=item;
		}
	}
	int pop() {
		if(top==-1) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
		 return a[top--];
		}
	}
	void show() {
		if(top!=-1) {
			System.out.println("Stack elements");
			for(int i=top;i>=0;i--)
				System.out.print(a[i]+" ");
			System.out.println();
		}
		else {
			System.out.println("Stack is empty");
		}
	}
}
public class Stackdemo {
	public static void main(String[]args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the stack size");
		n=sc.nextInt();
		Stack s = new Stack(n);
		int item;
		while(true) {
			System.out.println("choose 1)push 2)pop 3)show");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the item to insert");
				item=sc.nextInt();
				s.push(item);
				break;
			case 2:
				System.out.println("item poped is :"+s.pop());
				break;
			case 3:
				s.show();
				break;
			default:
				sc.close();
				System.exit(choice);
			}			
		}
	}
}
