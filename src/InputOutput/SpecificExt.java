//Write a Java program to get specific files with extensions from a specified folder.

package InputOutput;
import java.io.*;

public class SpecificExt{
       public static void main(String args[]){
        File file = new File("C://Users//nab275320//Documents//Assignment_4//src//GeneralQuestions");
           String[] list = file.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
             if(name.toLowerCase().endsWith(".java")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}
