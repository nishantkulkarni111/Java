

public class Student {
	private int rollno;
	private String firstName;
	private String LastName;
	private float percentage;
	
	public Student(int rollno, String firstName, String LastName, float percentage) {
	
	this.rollno = rollno;
	this.firstName = firstName;
	this.LastName = LastName;
	this.percentage = percentage;

}
	public Student(int rn, String fnm, String lnm, int m1, int m2, int m3) {
		// TODO Auto-generated constructor stub
	}
	public int getrollno() {
	return rollno ;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public float getpercentage() {
		return percentage;
	}
	
	public void setrollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public void setpercentage(float percentage) {
		this.percentage =percentage;
	}
	
}
