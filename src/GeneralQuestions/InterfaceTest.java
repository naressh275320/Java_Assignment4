//Java Program to Create an Interface 
/*An interface in Java is a blueprint of a class. It has static constants and abstract methods.
The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. 
It is used to achieve abstraction and multiple inheritance in Java.
In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body. */

package GeneralQuestions;

interface InterfaceTest {
    void interest();
}

class BOI implements InterfaceTest{
    public void interest(){
        System.out.println("Interest for SBI BANK: 8.5");
    }
}

class BOB implements InterfaceTest{
    public void interest(){
        System.out.println("Interest for BOB BANK: 8.95");
    }
}
