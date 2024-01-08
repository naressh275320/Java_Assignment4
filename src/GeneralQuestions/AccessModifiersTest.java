//Java Program to Show Usage of Access Modifier
/*The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. 
We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

There are four types of Java access modifiers:

Private:   The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
Default:   The access level of a default modifier is only within the package. It cannot be accessed from outside the package. 
           If you do not specify any access level, it will be the default.
Protected: The access level of a protected modifier is within the package and outside the package through child class. 
           If you do not make the child class, it cannot be accessed from outside the package.
Public:    The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, 
           within the package and outside the package. */


package GeneralQuestions;
class AccessModifiersTest {
    //Private variable
    //private int data = 9;
    
    //Default varaible
    int data1 = 10;
    
    //Protected variable
    protected int data2 = 11; 

    //Public variable
    public int data3 = 12;
    
    //private void fun(){
    //    System.out.println("Welcome to private method");
    //}

    void fun1(){
        System.out.println("Welcome to default method");
    }

    protected void fun2(){
        System.out.println("Welcome to protected method");
    }

    public void fun3(){
        System.out.println("Welcome to public method");
    }

}

class test1 extends AccessModifiersTest{
    public static void main(String args[]){
        AccessModifiersTest obj = new AccessModifiersTest();
        
        //Testing Private variable and method
        //Private variable and method are not accessible outside the class
        //System.out.println(obj.data);
        //obj.fun();
        
        //Testing Default variable and method
        //Default variable and method are accessible only within the package. Not accessible outside the package. 
        System.out.println("Default varaibale: " +obj.data1);
        obj.fun1();

        //Testing Protected variable and method
        //Protected data is accessible within the package and outside the package but only through inheritance. 
        System.out.println("Protected variable: "+obj.data2);
        obj.fun2();

        //Testing public variable and method
        //Public variable and method is accessible everywhere.
        System.out.println("Public variable: "+obj.data3);
        obj.fun3();

    }
}

