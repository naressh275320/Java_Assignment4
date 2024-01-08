//Java Program to Create Singleton Class 
/*A Singleton class is a class that allows only one instance of itself to be created and provides a global point of access to that instance. 
This is achieved by making the constructor private, so that no other instances of the class can be created, 
and providing a static method that returns the single instance of the class. */

package GeneralQuestions;
public class Singleton{
    private static Singleton instance = new Singleton();
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        return instance;
    }
}