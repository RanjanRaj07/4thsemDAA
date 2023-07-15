import java.util.Scanner;
public class Student {
	public static void main(String [] args) {
		String usn,name,branch,phoneno;
		Scanner s = new Scanner(System.in) ;
		System.out.println("enter the number of students");
		int n = s.nextInt();
		Studentclass []students = new Studentclass[n];
		System.out.println("enter the students details");
		for(int i=0;i<n;i++) {
			System.out.println("ente the "+(i+1)+" student details");
			System.out.println("enter USN");
			usn=s.next();
			System.out.println("enter NAME");
			name=s.next();
			System.out.println("enter branch");
			branch=s.next();
			System.out.println("ennter phone number");
			phoneno=s.next();
			students[i]=new Studentclass(usn,name,branch,phoneno);
		}
		System.out.println("USN"+"\t"+"NAME"+"\t"+"BRANCH"+"\t"+"PHONENO");
		for(int i=0;i<n;i++) {
			System.out.print(i+")");
			students[i].display();
		}	
		s.close();
	}
}
class Studentclass{
	private String usn,name,branch,phoneno;
	Studentclass(String usn,String name,String branch,String phoneno){
		this.usn=usn;
		this.name=name;
		this.branch=branch;
		this.phoneno=phoneno;
	}
	void display() {
		System.out.println(usn+"\t"+name+"\t"+branch+"\t"+phoneno);
	}
}