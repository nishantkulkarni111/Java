
import java.util.Scanner;

public class Test {
	
	public static void main(String [] args) {
		Scanner Scanner = new Scanner(System.in); 
		System.out.println("Enter no. of students");
		int size = Scanner.nextInt();
		Student[]s = new Student[size];
		
		
		System.out.println("Enter students detail---->");
		for(int i=0; i<s.length; i++)
			
		{
			System.out.println("Enter student rollno =");
			int rn = Scanner.nextInt();
			System.out.println("Enter student firstName =");
			String fnm = Scanner.next();
			System.out.println("Enter student LastName =");
			String lnm = Scanner.next();
			System.out.println("Enter student percentage =");
			float percent = Scanner.nextFloat();
			
			
			s[i] = new Student (rn, fnm, lnm, percent);
		}
		
		
		System.out.println("Students are as follows:");
		for (int i=0; i<s.length; i++)
		{
			System.out.println(s[i].getfirstName()+" "+s[i].getLastName()+" "+s[i].getrollno()+" "+s[i].getpercentage());
		}
				
			
		Scanner.close();
		
	

}}
