//Write a Java program to get a list of all file/directory names in the given directory.

package InputOutput;
import java.io.File;

public class DisplayAll {
    public static void main(String args[]){
        File fobj = new File("C://Users//nab275320//Documents//Assignment_4//src");
        String[] str = fobj.list();
        for(String s:str){
            System.out.println(s);
        }
    }
}
