//Java Program to Show Use of This Keyword in Class 
//In Java, this is a reference variable that refers to the current object.

package GeneralQuestions;
public class thisKey {
    int a;
    void fun(int a){
        this.a = a;
        System.out.println("Using of this keyword: "+this.a);
    }
}
