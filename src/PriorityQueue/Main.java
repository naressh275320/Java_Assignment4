package PriorityQueue;
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
                    System.out.println("\nQ1)Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue. \n");
                    Basic obj1 = new Basic();
                    obj1.fun();
                    break;

                case 2:
                    System.out.println("\nQ2)Write a Java program to iterate through all elements in the priority queue.\n");
                    IterateAll obj2 = new IterateAll();
                    obj2.fun();
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program to add all the elements of a priority queue to another priority queue. \n");
                    AddAll obj3 = new AddAll();
                    obj3.fun();
                    break;

                case 4:
                    System.out.println("\nQ4)Write a Java program to insert a given element into a priority queue. \n");
                    InsertEle obj4 = new InsertEle();
                    obj4.fun();
                    break;

                case 5:
                    System.out.println("\nQ5)Write a Java program to remove all elements from a priority queue. \n");
                    RemoveAll obj5 = new RemoveAll();
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
