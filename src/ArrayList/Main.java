package ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the question number(1-5). Enter 0 to exit: ");
        int a = s.nextInt();
        int c = 1;
        do{
            switch(a) {
                case 0:
                    c = -1;
                    break;

                case 1:
                    System.out.println("\nQ1)Write a Java program to create an array list, add some colors (strings), and print out the collection.\n");
                    Basic obj1 = new Basic();
                    obj1.fun();
                    break;

                case 2:
                    System.out.println("\nQ2)Write a Java program to iterate through all elements in an array list.\n");
                    Iterate obj2 = new Iterate();
                    obj2.fun();
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program to insert an element into the array list at the first position.\n");
                    InsertAtFirst obj3 = new InsertAtFirst();
                    obj3.fun();
                    break;

                case 4:
                    System.out.println("\nQ4)Write a Java program to retrieve an element (at a specified index) from a given array list.\n");
                    Retrieve obj4 = new Retrieve();
                    obj4.fun();
                    break;

                case 5:
                    System.out.println("\nQ5)Write a Java program to remove the third element from an array list.\n");
                    RemoveThird obj5 = new RemoveThird();
                    obj5.fun();
                    break;
                
                default:
                    System.out.println("\nInvalid choice");
                    break;
            }
            if(c !=-1){
                System.out.print("\nEnter the question number(1-5). Enter 0 to exit: ");
                a = s.nextInt();
            }
        }while (a != 0);
    }
}
