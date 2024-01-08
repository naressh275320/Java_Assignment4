package TreeMap;
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
                    System.out.println("\nQ1)Write a Java program to associate the specified value with the specified key in a Tree Map.\n");
                    BasicTreeMap obj1 = new BasicTreeMap();
                    obj1.fun();
                    break;

                case 2:
                    System.out.println("\nQ2)Write a Java program to copy Tree Map's content to another Tree Map.\n");
                    CopyTreeMap obj2 = new CopyTreeMap();
                    obj2.fun();
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program to search for a key in a Tree Map.\n");
                    SearckKey obj3 = new SearckKey();
                    obj3.fun();
                    break;

                case 4:
                    System.out.println("\nQ4)Write a Java program to search for a value in a Tree Map.\n");
                    SearchValue obj4 = new SearchValue();
                    obj4.fun();
                    break;

                case 5:
                    System.out.println("\nQ5)Write a Java program to get all keys from a Tree Map.\n");
                    AllKeys obj5 = new AllKeys();
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
