//Java Program to Create Abstract Class 
/* A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and 
non-abstract methods (method with the body).
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
Another way, it shows only essential things to the user and hides the internal details, for example, 
sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery. 
 */

package GeneralQuestions;

abstract class AbstractClass1{
    abstract void info();
}

class Student extends AbstractClass1{
    void info(){
        String name = "Deva";
        int age = 15;
        float grade =  56.5f;

        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
    }
}  
