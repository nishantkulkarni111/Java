import java.util.Arrays;
import java.util.*;

class MyIntStack {
	
	private int arr[];
	private int top;
	
	
	public MyIntStack() {
		arr= new int[10];
		top=-1;
		
	}
	public MyIntStack(int d) {
		arr= new int[d];
		top=-1;
		
	}
	public boolean Isfull() {
		if(top==arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean IsEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}

	public void push(int d) {
		if(Isfull()) {
			System.out.println("\nOverflow.....");
             return;		
		}
		top=top+1;
		arr[top]=d;
		return;
	}
	
	public int pop() {
		int d= -999;
		if(IsEmpty()) {
			System.out.println("\nUnderflow");
			return d;
		}
		d=arr[top];
		top=top-1;
		return d;
		}
	
	public int peek() {
        if (IsEmpty()) {
            System.out.println("No values..");
            return -999;
        }
        return arr[top];
    }


	public String toString() {
	    String result = "Arr = ";
	    for (int i = top; i >= 0; i--) {
	        result += arr[i] + " ";
	    }
	    return result;
	}

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        MyIntStack stack = new MyIntStack(20);
	        int choice, value;

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
	                    System.out.print("Enter value to push: ");
	                    value = scanner.nextInt();
	                    stack.push(value);
	                    break;
	                case 2:
	                    System.out.println("Popped value: " + stack.pop());
	                    break;
	                case 3:
	                    System.out.println("Top value: " + stack.peek());
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


		
		
		




