package LinkedList;
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
                    System.out.println("\nQ1)Write a Java program to append the specified element to the end of a linked list.\n");
                    AppendAtEnd obj1 = new AppendAtEnd();
                    obj1.fun();
                    break;

                case 2:
                    System.out.println("\nQ2)Write a Java program to iterate through all elements in a linked list.\n");
                    IterateAll obj2 = new IterateAll();
                    obj2.fun();
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program to iterate through all elements in a linked list starting at the specified position.\n");
                    IterateFromSpecified obj3 = new IterateFromSpecified();
                    obj3.fun();
                    break;

                case 4:
                    System.out.println("\nQ4)Write a Java program to iterate a linked list in reverse order. \n");
                    IterateReverse obj4 = new IterateReverse();
                    obj4.fun();
                    break;

                case 5:
                    System.out.println("\nQ5)Write a Java program to insert the specified element at the specified position in the linked list. \n");
                    SpecElePos obj5 = new SpecElePos();
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
