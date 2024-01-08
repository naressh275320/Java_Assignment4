package TreeSet;
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
                    System.out.println("\nQ1)Write a Java program to create a tree set, add some colors (strings) and print out the tree set. \n");
                    BasicTreeSet obj1 = new BasicTreeSet();
                    obj1.fun();
                    break;

                case 2:
                    System.out.println("\nQ2)Write a Java program to iterate through all elements in a tree set. \n");
                    IterateTreeSet obj2 = new IterateTreeSet();
                    obj2.fun();
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program to add all the elements of a specified tree set to another tree set.\n");
                    CopyTreeSet obj3 = new CopyTreeSet();
                    obj3.fun();
                    break;

                case 4:
                    System.out.println("\nQ4)Write a Java program to create a reverse order view of the elements contained in each tree set. \n");
                    ReverseView obj4 = new ReverseView();
                    obj4.fun();
                    break;

                case 5:
                    System.out.println("\nQ5)Write a Java program to get the first and last elements in a tree set. \n");
                    FirstLastEle obj5 = new FirstLastEle();
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
