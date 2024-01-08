package GeneralQuestions;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the question number(1-13, Enter 0 to exit): ");
        int a = s.nextInt();
        int c = 1;
        do{
            switch(a) {
                case 0:
                    c = -1;
                    break;

                //Abstract Class
                case 1:
                    System.out.println("Java Program to Create Abstract Class ");
                    AbstractionTest obj1 = new AbstractionTest();
                    obj1.info();
                    break;

                //Singleton class
                case 2:
                    System.out.println("Java Program to Create Singleton Class ");
                    Singleton obj2 = Singleton.getInstance();
                    Singleton obj3 = Singleton.getInstance();
                    if(obj2 == obj3){
                        System.out.println("Both the singleton class objects are same");
                    }
                    break;

                //Interface 
                case 3:
                    System.out.println("Java Program to Create an interface ");
                    BOI obj4 = new BOI();
                    obj4.interest();
                    BOB obj5 = new BOB();
                    obj5.interest();
                    break;

                //Encapsulation in class
                case 4:
                    System.out.println("Java Program to Show Encapsulation in Class");
                    EncapsulationTest obj6 = new EncapsulationTest();
                    obj6.setName("Ravi");
                    String name = obj6.getName();
                    System.out.println(name);
                    break;

                //Inheritance in class
                case 5:
                    System.out.println("Java Program to Show Inheritance in Class");
                    EV obj7 = new EV();
                    obj7.driveCar();
                    obj7.driveEV();
                    obj7.driveTruck();

                    bike obj8 = new bike();
                    obj8.driveBike();
                    obj8.driveTruck();
                    break;

                //Abstraction in class
                case 6:
                    System.out.println("Java Program to Show abstraction in Class");
                    Student obj9 = new Student();
                    obj9.info();
                    break;

                //Data Hiding in class
                case 7:
                    System.out.println("Java Program to Show Data Hiding in Class");
                    DataHiding obj10 = new DataHiding();
                    obj10.setName("Vivek");
                    String name2 = obj10.getName();
                    System.out.println(name2);
                    break;

                //Overloading of method in class
                case 8:
                    System.out.println("Java Program to Show overloading of method in Class");
                    Overloading obj11 = new Overloading();
                    System.out.println(obj11.fun(4, 5));
                    System.out.println(obj11.fun(4.5f, 5.4f));
                    break;

                //Java Program to Show Overriding of Methods in Classes 
                case 9:
                    System.out.println("Java Program to Show Overriding of method in Class");
                    SBI obj12 =new SBI();  
                    ICICI obj13 =new ICICI();  
                    AXIS obj14 =new AXIS();  

                    System.out.println("SBI Rate of Interest: "+ obj12.getRateOfInterest());  
                    System.out.println("ICICI Rate of Interest: "+ obj13.getRateOfInterest());  
                    System.out.println("AXIS Rate of Interest: "+ obj14.getRateOfInterest()); 
                    break;

                //super Keyowrd in class
                case 10:
                    System.out.println("Java Program to Show Use of super Keyword in Class ");
                    Ghost obj15 = new Ghost();
                    obj15.fun(5);
                    break;

                //this Keyowrd in class
                case 11:
                    System.out.println("Java Program to Show Use of Super Keyword in Class ");
                    thisKey obj16 = new thisKey();
                    obj16.fun(5);
                    break;

                //static Keyowrd in class
                case 12:
                    System.out.println("Java Program to Show Use of Super Keyword in Class ");
                    staticKey obj17 = new staticKey(22, "Aryan");
                    staticKey obj18 = new staticKey(33, "Kumar");
                    obj17.display();
                    obj18.display();

                    staticKey.change("NIT");
                    obj17.display();
                    obj18.display();
                    break;
  
                //Access Modifiers in java
                case 13:
                    System.out.println("Java Program to Show Use of access modifiers in Class ");
                    AccessModifiersTest obj19 = new AccessModifiersTest();
                    
                     //Testing Private variable and method
                    //Private variable and method are not accessible outside the class
                    //System.out.println(obj.data);
                    //obj.fun();
                    
                    //Testing Default variable and method
                    //Default variable and method are accessible only within the package. Not accessible outside the package. 
                    System.out.println("Default varaibale: " +obj19.data1);
                    obj19.fun1();

                    //Testing Protected variable and method
                    //Protected data is accessible within the package and outside the package but only through inheritance. 
                    System.out.println("Protected variable: "+obj19.data2);
                    obj19.fun2();

                    //Testing public variable and method
                    //Public variable and method is accessible everywhere.
                    System.out.println("Public variable: "+obj19.data3);
                    obj19.fun3();
                    break;

                default:
                    break;
            }
            if(c !=-1){
                System.out.println("Enter the question number(1-13, Enter 0 to exit): ");
                a = s.nextInt();
            }
        }while(a != 0);
    }
}
