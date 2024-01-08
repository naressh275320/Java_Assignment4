//Java Program to Show Overloading of Methods in Class 
/*If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
If we have to perform only one operation, having same name of the methods increases the readability of the program.
Suppose you have to perform addition of the given numbers but there can be any number of arguments, 
if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters 
then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs. */

package GeneralQuestions;
public class Overloading{
    int fun(int a, int b){
        return a+b;
    }
    float fun(float a, float b){
        return a+b;
    }
}
