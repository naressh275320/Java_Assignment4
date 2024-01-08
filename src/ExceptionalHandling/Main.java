
package ExceptionalHandling;
import java.io.File;
import java.io.FileNotFoundException;
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
                    System.out.println("\nQ1)Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.\n");
                    OddInteger obj1 = new OddInteger();
                    System.out.println("The first number is: 5");
                    obj1.oddCheck(5);
                    System.out.println("The first number is: 6");
                    obj1.oddCheck(6);
                    break;

                case 2:
                    System.out.println("\nQ2)Write a Java program to create a method that reads a file and throws an exception if the file is not found.\n");
                    ReadFileExcep obj2 = new ReadFileExcep();
                    File file = new File("C:/Users/nab27nts/Assignment_4/src/GeneralQuestions");
                    obj2.exce(file);
                    break;

                case 3:
                    System.out.println("\nQ3)Write a Java program that reads a file and throws an exception if the file is empty.\n");
                    EmptyFile obj3 = new EmptyFile();
                    try{
                        obj3.posi("C:\\Users\\nab275320\\Documents\\Assignment_4\\src\\GeneralQuestions");
                        System.out.println("File is not empty");
                    }catch(FileNotFoundException e){
                        System.out.println(e + " \nFile not found exception");
                    }catch(EmptyFileException e){
                        System.out.println(e + " \nEmpty file exception");
                    }
                    break;

                case 4:
                    System.out.println("\nQ4)Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.\n");
                    Vowels obj4 = new Vowels();
                    try {
                        String text = "mnmncmvn rrtywtr";
                        System.out.println("Original string: " + text);
                        obj4.checkVowels(text);
                        System.out.println("String contains vowels.");
                      } catch (NoVowelsException e) {
                        System.out.println("Exception: " + e.getMessage());
                      }
                    break;

                case 5:
                      System.out.println("\nQ5)Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.\n");
                    PositiveNumber obj5 = new PositiveNumber();
                    try {
                        obj5.readFile("empty.txt");
                      } catch (FileNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                      }
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
