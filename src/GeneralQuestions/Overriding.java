//Java Program to Show Overriding of Methods in Classes 
/*If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, 
it is known as method overriding. */

package GeneralQuestions;
class Overriding {
    int getRateOfInterest()
    {
        return 0;
    }  
}  
          
class SBI extends Overriding{  
    int getRateOfInterest(){
        return 8;
    }  
}  
          
class ICICI extends Overriding{  
    int getRateOfInterest(){
        return 7;
    }  
}  
        
class AXIS extends Overriding{  
    int getRateOfInterest(){
        return 9;
    }  
}  