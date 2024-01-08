//Java Program to Show Usage of Static keyword in Class 
/*The static keyword in Java is used for memory management mainly. 
We can apply static keyword with variables, methods, blocks and nested classes. 
The static keyword belongs to the class than an instance of the class. */

package GeneralQuestions;
class staticKey{  
    int rollno;
    String name;  

    //static variable  
    static String college ="IIT";
    
    staticKey(int rollno, String name){  
    this.rollno = rollno;  
    this.name = name;  
    }  
     
    void display (){
        System.out.println(rollno + " " + name + " " + college);
    }  

    static void change(String college2){
        college = college2;
    }

    static{
        System.out.println("Static Block is invoked");
    }
 }  