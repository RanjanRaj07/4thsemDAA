/* super class implimentation */
import java.util.Scanner;
public class Staffdemo {
	public static void main(String[]args) {
		int i,choice;
		String staffid,name;
		float salary;
		String phno,domain,publication,skills,period;
		int teachingcount=0,technicalcount=0,contractcount=0;
		System.out.println("enter the number of staff to be created for each category");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Teaching []teachingstaff = new Teaching[n];
		Technical []technicalstaff = new Technical[n];
		Contract []contractstaff = new Contract[n];
		System.out.println("enter your choice");
		System.out.println("1.Teaching staff entry\n2.Technicalstaff entery\n3.Contractstaff entry\n4.Teaching staff details\n5.Technical staff details\n6.Contract staff details\n7.exit");
		choice = s.nextInt();
		while(true) {
		switch(choice) {
			case 1:
				try {
					System.out.println("enter teaching staff (details id,name,salary,phno,domain,publication)");
					staffid = s.next();
					name = s.next();
					salary = s.nextFloat();
					phno = s.next();
					domain = s.next();
					publication = s.next();
					teachingstaff[teachingcount] = new Teaching(staffid,name,salary,phno,domain,publication);
					teachingcount++;
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("teaching staff entries not vacent");
				}break;
			case 2:
				try {
					System.out.println("enter technical staff (details id,name,salary,phno,skills)");
					staffid = s.next();
					name = s.next();
					salary = s.nextFloat();
					phno = s.next();
					skills = s.next();
					technicalstaff[technicalcount] = new Technical(staffid,name,salary,phno,skills);
					technicalcount++;
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("technical staff entries not vacent");
				}break;
			case 3:
				try {
					System.out.println("enter contract staff (details id,name,salary,phno,period)");
					staffid = s.next();
					name = s.next();
					salary = s.nextFloat();
					phno = s.next();
					period = s.next();
					contractstaff[contractcount] = new Contract(staffid,name,salary,phno,period);
					contractcount++;
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("contract staff entries not vacent");
				}break;
			case 4:
				if(teachingcount==0)
					System.out.println("no teaching staff details");
				else {
					System.out.println("teaching staff details are:");
					for(i=1;i<=teachingcount;i++)
						System.out.println(teachingstaff[i-1]);
				}
				break;
			case 5:
				if(technicalcount==0)
					System.out.println("no technical staff details");
				else {
					System.out.println("technical staff details are:");
					for(i=1;i<=technicalcount;i++)
						System.out.println(technicalstaff[i-1]);
				}
				break;
			case 6:
				if(contractcount==0)
					System.out.println("no contract staff details");
				else {
					System.out.println("contract staff details are:");
					for(i=1;i<=contractcount;i++)
						System.out.println(contractstaff[i-1]);
				}
				break;
			case 7:
				System.exit(0);
		}
		}
	}
}
class Staff{
	private String staffid;
	private String name;
	private float salary;
	private String phno;
	Staff(String sid,String sn,float ss,String pno) {
		staffid=sid;
		name=sn;
		salary=ss;
		phno=pno;
	}
	public String tostring() {
		return("STAFFID:"+staffid+"\t"+"STAFFNAME:"+name+"\t"+"SALARY:"+salary+"\t"+"PHNO:"+phno);
	}
}
class Teaching extends Staff{
	private String domain;
	private String publication;
	public Teaching(String staffid,String staffname,float staffsalary,String staffphno,String staffdomain,String staffpublication) {
		super(staffid,staffname,staffsalary,staffphno);
		domain = staffdomain;
		publication = staffpublication;
	}
	public String tostring() {
		return super.tostring()+"\t"+"DOMAIN:"+domain+"\t"+"PUBLICATION:"+publication;
	}
}
class Technical extends Staff{
	private String skills;
	public Technical(String staffid,String staffname,float staffsalary,String staffphno,String staffskills) {
		super(staffid,staffname,staffsalary,staffphno);
		skills=staffskills;
	}
	public String tostring() {
		return super.tostring()+"\t"+"SKILLS"+skills;
	}
}
class Contract extends Staff{
	private String period;
	public Contract(String staffid,String staffname,float staffsalary,String staffphno,String staffperiod) {
		super(staffid,staffname,staffsalary,staffphno);
		period=staffperiod;
	}
	public String tostring() {
		return super.tostring()+"\t"+"PERIOD"+period;
	}
}
