package Lambda;

import java.util.Scanner;

import ArrayList.InsertAtFirst;
import ArrayList.Iterate;
import ArrayList.RemoveThird;
import ArrayList.Retrieve;

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
                    System.out.println("\nQ1)Write a Java program to implement a lambda expression to find the sum of two integers.\n");
                    InnerSum obj1 = (i, j) -> i+j;
                    System.out.println("Enter integer 1: ");
                    int x = s.nextInt();
                    System.out.println("Enter integer 2: ");
                    int y = s.nextInt();
                    System.out.println("Sum of two numbers is: " + obj1.add(x, y));
                    break;

                case 2:
                    System.out.println("\nQ2)Write a Java program to implement a lambda expression to check if a given string is empty.\n");
                    EmptyStr obj2 = (str) -> str.isEmpty();
                    System.out.println("Enter String: ");
                    String str = s.next();
                    System.out.println("Is the entered string empty? " + obj2.checkempty(str));
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.\n");
                    ConvertCase obj3 = new ConvertCase();
                    obj3.fun();
                    break;

                case 4:
                    System.out.println("\nQ4)Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.\n");
                    AbstractFact obj = (n) -> {
                        long result = 1;
                        for (long i = 1; i <= n; i++) {
                            result *= i;
                        }
                        return result;
                    };
                    System.out.print("Enter number to find factorial: ");
                    long n4 = s.nextInt();
                    System.out.println("Factorial of number " + n4 + " is: " + obj.FactorialCalc(n4));
                    break;

                case 5:
                    System.out.println("\nQ5)Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.\n");
                    SortStrings obj5 = new SortStrings();
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
