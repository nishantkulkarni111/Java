
import java.util.Scanner;
import java.util.Stack;

public class StudentStackMenu {
    
    private int rollno;
    private String firstName;
    private String LastName;
    private int m1, m2, m3;
    private float percentage;
    
    public StudentStackMenu(int rollno, String firstName, String LastName, int m1, int m2, int m3) {
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
        Stack<StudentStackMenu> studentStack = new Stack<>();
        int maxSize = 10; 

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Is Full");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (studentStack.size() == maxSize) {
                        System.out.println("Stack is full. Cannot push more students.");
                    }
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

                        StudentStackMenu student = new StudentStackMenu(rn, fnm, lnm, m1, m2, m3);
                        studentStack.push(student);
                        System.out.println("Student pushed to stack.");
               
                    break;
                case 2:
                    if (studentStack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot pop.");
                    } 
                        StudentStackMenu student1 = studentStack.pop();
                        System.out.println("Popped student: " + student1.getFirstName() + " " + student1.getLastName());
                 
                    break;
                case 3:
                    if (studentStack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot peek.");
                    } 
                        StudentStackMenu student2 = studentStack.peek();
                        System.out.println("Top student: " + student2.getFirstName() + " " + student2.getLastName());
                    
                    break;
                case 4:
                    System.out.println("Is stack empty? " + studentStack.isEmpty());
                    break;
                case 5:
                    System.out.println("Is stack full? " + (studentStack.size() == maxSize));
                    break;
                case 6:
                    if (studentStack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } 
                        System.out.println("Students in stack:");
                        for (StudentStackMenu student3 : studentStack) {
                            System.out.println("First name: " + student3.getFirstName() + "\t Last name: " + student3.getLastName() + "\t Roll no: " + student3.getRollno() + "\t Percentage: " + student3.Calpercentage());
                        
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
