import java.util.*;
public class CustomerDemo {
	public static void main(String [] args)
	{
		String name;
		String date;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the customer name");
		name=sc.next();
		System.out.println("enter the date of birth in dd/mm/yyyy");
		date=sc.next();
		Customer customer = new Customer(name,date);
		System.out.println(customer.toString());
		sc.close();
	}
}
class Customer{
	private String name;
	private String date;
	public Customer(String name,String date) {
		this.name=name;
		this.date=date;
	}
	public String toString() {
		String returnvalue=name;
		StringTokenizer tokenizer = new StringTokenizer(date,"/");
		System.out.println("the customer details are");
		while(tokenizer.hasMoreTokens()) {
			returnvalue=returnvalue+","+tokenizer.nextToken();
		}
		return returnvalue;
	}
}
