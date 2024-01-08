//Java Program to Show Use of Super Keyword in Class 
/*The super keyword in Java is a reference variable which is used to refer immediate parent class object.
Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.*/

package GeneralQuestions;
class SuperKey {
    int a;
}

class Ghost extends SuperKey{
    void fun(int a){
        super.a = a;
        System.out.println("use of super keyword: "+super.a);
    }
}