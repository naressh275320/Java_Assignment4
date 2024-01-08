package Streams;

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
                    System.out.println("\nQ1). Write a Java program to calculate the average of a list of integers using streams.\n");
                    average obj1 = new average();
                    obj1.compute();
                    break;

                case 2:
                    System.out.println("\nQ2)Write a Java program to convert a list of strings to uppercase or lowercase using streams.\n");
                    StringCase obj2 = new StringCase();
                    obj2.casechange();
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program to calculate the sum of all even, odd numbers in a list using streams.\n");
                    sumevenodd obj3 = new sumevenodd();
                    obj3.sumof();
                    break;

                case 4:
                    System.out.println("\nQ4)Write a Java program to remove all duplicate elements from a list using streams.\n");
                    Duplicate obj4 = new Duplicate();
                    obj4.findduplicate();
                    break;

                case 5:
                    System.out.println("\nQ5)Write a Java program to count the number of strings in a list that start with a specific letter using streams.\n");
                    SpecificLetter obj5 = new SpecificLetter();
                    obj5.startingc();
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
