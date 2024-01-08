package HashSet;
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
                    System.out.println("\nQ1)Write a Java program to append the specified element to the end of a hash set. \n");
                    BasicHashSet obj1 = new BasicHashSet();
                    obj1.fun();
                    break;

                case 2:
                    System.out.println("\nQ2)Write a Java program to iterate through all elements in a hash list. \n");
                    IterateAll obj2 = new IterateAll();
                    obj2.fun();
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program to get the number of elements in a hash set. \n");
                    SizeHashSet obj3 = new SizeHashSet();
                    obj3.fun();
                    break;

                case 4:
                    System.out.println("\nQ4)Write a Java program to empty an hash set. \n");
                    EmptyHashSet obj4 = new EmptyHashSet();
                    obj4.fun();
                    break;

                case 5:
                    System.out.println("\nQ5)Write a Java program to test if a hash set is empty or not. \n");
                    CheckEmpty obj5 = new CheckEmpty();
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
