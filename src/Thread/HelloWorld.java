//Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.

package Thread;

public class HelloWorld extends Thread{
    public void run(){
        System.out.println("Hello, World!");
    }
    public static void main(String args[]){
        HelloWorld t1 = new HelloWorld();
        t1.start();
    }
}
