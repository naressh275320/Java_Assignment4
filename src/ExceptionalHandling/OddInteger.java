//•	Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

package ExceptionalHandling;

class OddInteger{
    void oddCheck(int a){
        try{
            if(a%2!=0){
                throw new IllegalArgumentException("The number is odd");
            }
            System.out.println("The number is even");
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
