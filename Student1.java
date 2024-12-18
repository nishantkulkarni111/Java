

import java.util.Scanner;

public class Student1 {
	
		private int rollno;
		private String firstName;
		private String LastName;
		private  int m1,m2,m3;
		@SuppressWarnings("unused")
		private float percentage;
		
		public Student1(int rollno, String firstName, String LastName, int m1,int m2,int m3) {
		
		this.rollno = rollno;
		this.firstName = firstName;
		this.LastName = LastName;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.percentage=Calpercentage();

	}
		
		
		
public void setRollno(int rollno) {
			this.rollno = rollno;
		}



		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}



		public void setLastName(String lastName) {
			LastName = lastName;
		}



		public void setM1(int m1) {
			this.m1 = m1;
		}



		public void setM2(int m2) {
			this.m2 = m2;
		}



		public void setM3(int m3) {
			this.m3 = m3;
		}



        public int getM1() {
			return m1;
		}



		public int getM2() {
			return m2;
		}



		public int getM3() {
			return m3;
		}
		
		
		
		
		public int getRollno() {
			return rollno;
		}



		public String getFirstName() {
			return firstName;
		}



		public String getLastName() {
			return LastName;
		}



	

		public float Calpercentage() {
			return ((m1+m2+m3)*100)/300f;
		}



public static void main(String [] args) {
			Scanner Scanner = new Scanner(System.in); 
			System.out.println("Enter no. of students");
			int size = Scanner.nextInt();
			Student1[]s = new Student1[size];
			
			
			System.out.println("Enter students detail---->");
			for(int i=0; i<s.length; i++)
				
			{
				System.out.println("Enter student rollno =");
				int rn = Scanner.nextInt();
				System.out.println("Enter student firstName =");
				String fnm = Scanner.next();
				System.out.println("Enter student LastName =");
				String lnm = Scanner.next();
				System.out.println("Enter sub1 marks =");
				int m1 = Scanner.nextInt();
				System.out.println("Enter sub2 marks =");
				int m2 = Scanner.nextInt();
				System.out.println("Enter sub3 marks =");
				int m3 = Scanner.nextInt();
				
				s[i] = new Student1(rn, fnm,lnm,m1,m2,m3);
				
			}
			
			
			System.out.println("Students are as follows:");
			for (int i=0; i<s.length; i++)
			{
				System.out.println("First name :"+s[i].getFirstName()+"\t last name :"+s[i].getLastName()+"\t Roll no:  "+s[i].getRollno()+"\t percentage : "+s[i].Calpercentage());
			}
		Scanner.close();			
				
}
}