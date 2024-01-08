package Regular;

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
                    System.out.println("\nQ1)Write a Java program that takes a number and sets a thousand separators for that number.\n");
                    Seperator obj1 = new Seperator();
                    System.out.println("Enter the Integer: ");
                    int num = s.nextInt();
                    System.out.println(obj1.seperate(Integer.toString(num)));
                    break;

                case 2:
                    System.out.println("\nQ2)Write a Java program to remove all non-alphanumeric characters from a given string.\n");
                    RemoveAlpNum obj2 = new RemoveAlpNum();
                    System.out.println("Enter the String: ");
                    String str = s.next();
                    System.out.println(obj2.remove(str));
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program to validate a phone number.\n");
                    ValidatePhNo obj3 = new ValidatePhNo();
                    System.out.println("Enter the phone number: ");
                    String phno = s.next();
                    System.out.println(obj3.validate(phno));
                    break;

                case 4:
                    System.out.println("\nQ4)Write a Java program to move all lower-case letters to the front of a given word. This will keep the \r\n" + //
                            "relative position of all the letters (both upper and lower case) same.\n");
                    LowUppCase obj4 = new LowUppCase();
                    System.out.println("Enter the string: ");
                    String ulcase = s.next();
                    System.out.println(obj4.case1(ulcase));
                    break;

                case 5:
                    System.out.println("\nQ5)Write a Java program to separate consonants and vowels from a given string.\n");
                    VowCons obj5 = new VowCons();
                    System.out.println("Enter the string: ");
                    String vcstr = s.next();
                    System.out.println(obj5.vowcos(vcstr));
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
