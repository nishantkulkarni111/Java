
import java.util.*;

class StudentStack2 {
    private StudentStack2[] students;
    private int top;
    private int rollNo;
    private String firstName;
    private String lastName;
    private int marks1;
    private int marks2;
    private int marks3;

    public StudentStack2() {
        students = new StudentStack2[10];
        top = -1;
    }

    public StudentStack2(int size) {
        students = new StudentStack2[size];
        top = -1;
    }

    public StudentStack2(int rollNo, String firstName, String lastName, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public boolean isFull() {
        return top == students.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(StudentStack2 student) {
        if (isFull()) {
            System.out.println("\nOverflow.....");
            return;
        }
        top = top + 1;
        students[top] = student;
    }

    public StudentStack2 pop() {
        if (isEmpty()) {
            System.out.println("\nUnderflow");
            return null;
        }
        StudentStack2 student = students[top];
        top = top - 1;
        return student;
    }

    public StudentStack2 peek() {
        if (isEmpty()) {
            System.out.println("No values..");
            return null;
        }
        return students[top];
    }

    public String toString() {
        String result = "Stack:\n";
        for (int i = top; i >= 0; i--) {
            result += "Roll No: " + students[i].rollNo
                    + ", Name: " + students[i].firstName + " " + students[i].lastName
                    + ", Marks:  sub1:" + students[i].marks1 + ", sub2: " + students[i].marks2 + ", sub3 : " + students[i].marks3
                    + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentStack2 stack = new StudentStack2(20);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student roll no:");
                    int rn = scanner.nextInt();
                    System.out.println("Enter student first name:");
                    String fnm = scanner.next();
                    System.out.println("Enter student last name:");
                    String lnm = scanner.next();
                    System.out.println("Enter marks for subject 1:");
                    int m1 = scanner.nextInt();
                    System.out.println("Enter marks for subject 2:");
                    int m2 = scanner.nextInt();
                    System.out.println("Enter marks for subject 3:");
                    int m3 = scanner.nextInt();

                    StudentStack2 student = new StudentStack2(rn, fnm, lnm, m1, m2, m3);
                    stack.push(student);
                    System.out.println("Student pushed to stack.");
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot pop.");
                    } else {
                        StudentStack2 poppedStudent = stack.pop();
                        System.out.println("Popped student: " +poppedStudent.rollNo+ " "+ poppedStudent.firstName + " " + poppedStudent.lastName);
                    }
                    break;
                case 3:
                    StudentStack2 topStudent = stack.peek();
                    if (topStudent != null) {
                        System.out.println("Top student: "+topStudent.rollNo+" " + topStudent.firstName + " " + topStudent.lastName);
                    }
                    break;
                case 4:
                    System.out.println(stack.toString());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}