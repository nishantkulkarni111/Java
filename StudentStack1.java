
	
	import java.util.Scanner;
	import java.util.Stack;

	public class StudentStack1 {
	    
	    private int rollno;
	    private String firstName;
	    private String LastName;
	    private int m1, m2, m3;
	    private float percentage;
	    
	    public StudentStack1(int rollno, String firstName, String LastName, int m1, int m2, int m3) {
	        this.rollno = rollno;
	        this.firstName = firstName;
	        this.LastName = LastName;
	        this.m1 = m1;
	        this.m2 = m2;
	        this.m3 = m3;
	        this.percentage = Calpercentage();
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
	        return ((m1 + m2 + m3) * 100) / 300f;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Stack<StudentStack1> studentStack = new Stack<>();

	        System.out.println("Enter no. of students");
	        int size = scanner.nextInt();

	        System.out.println("Enter students detail---->");
	        for (int i = 0; i < size; i++) {
	            System.out.println("Enter student rollno =");
	            int rn = scanner.nextInt();
	            System.out.println("Enter student firstName =");
	            String fnm = scanner.next();
	            System.out.println("Enter student LastName =");
	            String lnm = scanner.next();
	            System.out.println("Enter sub1 marks =");
	            int m1 = scanner.nextInt();
	            System.out.println("Enter sub2 marks =");
	            int m2 = scanner.nextInt();
	            System.out.println("Enter sub3 marks =");
	            int m3 = scanner.nextInt();

	            StudentStack1 student = new StudentStack1(rn, fnm, lnm, m1, m2, m3);
	            studentStack.push(student);
	        }

	        System.out.println("Students are as follows:");
	        while (!studentStack.isEmpty()) {
	            StudentStack1 student = studentStack.pop();
	            System.out.println("First name :" + student.getFirstName() + "\t last name :" + student.getLastName() + "\t Roll no:  " + student.getRollno() + "\t percentage : " + student.Calpercentage());
	        }
	        scanner.close();
	    }
	}
