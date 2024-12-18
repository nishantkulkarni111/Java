import java.util.Scanner;

public class Doublestack {
   private int arr[];
   private int topA;
   private int 	topB;
   
   public Doublestack()
   {
	   arr = new int[10];
	   topA = -1;
	   topB = arr.length;
   }
   public Doublestack(int d) {
		arr= new int[d];
		topA=-1;
		topB=arr.length;
	} 


   public boolean Isfull() {
		if((topB-topA)==1) {
			return true;
		}
		else {
			return false;
		}
	}
   public boolean IsEmpty() {
		if(topB==arr.length-1||topA==-1) {
			return true;
		}
		else {
			return false;
		}
	}
   public void pushA(int d) {
		if(Isfull()) {
			System.out.println("\nOverflow.....");
            return;		
		}
		topA=topA+1;
		arr[topA]=d;
		
	}
   public void pushB(int d) {
		if(Isfull()) {
			System.out.println("\nOverflow.....");
            return;		
		}
		topB=topB+1;
		arr[topB]=d;
		
	}
   public int popA() {
		int d= -999;
		if(IsEmpty()) {
			System.out.println("\nUnderflow");
			return d;
		}
		d=arr[topA];
		topA=topA-1;
		return d;
		}
   
   public int popB() {
		int d= -999;
		if(IsEmpty()) {
			System.out.println("\nUnderflow");
			return d;
		}
		d=arr[topB];
		topB=topB+1;
		return d;
		}
   
	public int peekA() {
        if (IsEmpty()) {
            System.out.println("No values..");
            return -999;
        }
        return arr[topA];
    }
	
	public int peekB() {
        if (IsEmpty()) {
            System.out.println("No values..");
            return -999;
        }
        return arr[topB];
    }
   
	public String toStringA() {
	    String result = "Arr = ";
	    for (int i = topA; i >= 0; i--) {
	        result += arr[i] + " ";
	    }
	    return result;
	}
	
	public String toStringB() {
	    String result = "Arr = ";
	    for (int i = topB; i >= 0; i--) {
	        result += arr[i] + " ";
	    }
	    return result;
	}
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Doublestack doublestack = new Doublestack();
        
        while (true) {
            System.out.println("\nDouble Stack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\nPush Menu:");
                    System.out.println("1. Push to Stack A");
                    System.out.println("2. Push to Stack B");
                    System.out.print("Enter your choice: ");
                    int pushChoice = scanner.nextInt();
                    if (pushChoice == 1) {
                        System.out.print("Enter value to push to Stack A: ");
                        int valueA = scanner.nextInt();
                        doublestack.pushA(valueA);
                    } else if (pushChoice == 2) {
                        System.out.print("Enter value to push to Stack B: ");
                        int valueB = scanner.nextInt();
                        doublestack.pushB(valueB);
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 2:
                    System.out.println("\nPop Menu:");
                    System.out.println("1. Pop from Stack A");
                    System.out.println("2. Pop from Stack B");
                    System.out.print("Enter your choice: ");
                    int popChoice = scanner.nextInt();
                    if (popChoice == 1) {
                        int poppedA = doublestack.popA();
                        if (poppedA != -999) {
                            System.out.println("Popped from Stack A: " + poppedA);
                        }
                    } else if (popChoice == 2) {
                        int poppedB = doublestack.popB();
                        if (poppedB != -999) {
                            System.out.println("Popped from Stack B: " + poppedB);
                        }
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 3:
                    System.out.println("\nPeek Menu:");
                    System.out.println("1. Peek Stack A");
                    System.out.println("2. Peek Stack B");
                    System.out.print("Enter your choice: ");
                    int peekChoice = scanner.nextInt();
                    if (peekChoice == 1) {
                        int peekA = doublestack.peekA();
                        if (peekA != -999) {
                            System.out.println("Top of Stack A: " + peekA);
                        }
                    } else if (peekChoice == 2) {
                        int peekB = doublestack.peekB();
                        if (peekB != -999) {
                            System.out.println("Top of Stack B: " + peekB);
                        }
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 4:
                    System.out.println("\nDisplay Menu:");
                    System.out.println("1. Display Stack A");
                    System.out.println("2. Display Stack B");
                    System.out.print("Enter your choice: ");
                    int displayChoice = scanner.nextInt();
                    if (displayChoice == 1) {
                        System.out.println(doublestack.toStringA());
                    } else if (displayChoice == 2) {
                        System.out.println(doublestack.toStringB());
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 5:
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
