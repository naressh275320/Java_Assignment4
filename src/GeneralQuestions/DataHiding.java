//Java Program to Show Data Hiding in Class 
/*Data hiding is a technique of hiding internal object details, i.e., data members. It is an object-oriented programming technique. 
Data hiding ensures, or we can say guarantees to restrict the data access to class members. It maintains data integrity. */

package GeneralQuestions;

public class DataHiding {
    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
