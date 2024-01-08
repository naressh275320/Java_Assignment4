package HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the question number(1-5) Enter 0 to exit: ");
        int a = s.nextInt();
        int c = 1;
        do{
            switch(a) {
                case 0:
                    c = -1;
                    break;

                case 1:
                    System.out.println("\nQ1)Write a Java program to associate the specified value with the specified key in a HashMap.\n");
                    Specified obj1 = new Specified();
                    obj1.fun();
                    break;
                
                case 2:
                    System.out.println("\nQ2)Write a Java program to count the number of key-value (size) mappings in a map.\n");
                    CountSize obj2 = new CountSize();
                    obj2.fun();
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program to copy all mappings from the specified map to another map.\n");
                    CopyMap obj3 = new CopyMap();
                    obj3.fun();
                    break;

                case 4:
                    System.out.println("\nQ4)Write a Java program to remove all mappings from a map.\n");
                    RemoveAll obj4 = new RemoveAll();
                    obj4.fun();
                    break;

                case 5:
                    System.out.println("\nQ5)Write a Java program to check whether a map contains key-value mappings (empty) or not.\n");
                    CheckEmpty obj5 = new CheckEmpty();
                    obj5.fun();
                    break;

                default:
                    System.out.println("\nInvalid choice");
                    break;
            }
            if(c !=-1){
                System.out.print("\nEnter the question number(1-5) Enter 0 to exit: ");
                a = s.nextInt();
            }
        }while (a != 0);
    }
}
