/*
Program 1b: Write a java program to implement Stacks using Arrays.write Push & pop methods to demonstrate its working.
*/
import java.util.Scanner;

class Stack {
    private int maxsize,top,Stack[];

    public Stack(int s) {
        maxsize = s;
        Stack = new int[maxsize];
        top = -1;
    }

    public void push(int s) {
        if (top == maxsize - 1) {
            System.out.println("Overflow");
        } else {
            Stack[++top] = s;
            System.out.println("Value " + s + " is Pushed");
        }

    }

    public void pop() {
        if (top == -1)
        {
            System.out.println("No Elements");
        }
        else
        {
            System.out.println("Value " + Stack[top--] + " popped");
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("No Elements");
        } else 
        {
            for(int s = 0; s <= top; ++s)
            {
                System.out.println(Stack[s]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Elements");
        int n = sc.nextInt();
        Stack s = new Stack(n);

        int choice;
        do {
            System.out.println("1.Push\n2.pop\n3.Display\n4.exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Value to be pushed");
                    int v = sc.nextInt();
                    s.push(v);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
            }
        } while(choice != 4);
    }
}
