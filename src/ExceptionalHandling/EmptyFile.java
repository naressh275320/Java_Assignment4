//Write a Java program that reads a file and throws an exception if the file is empty.

package ExceptionalHandling;

import java.io.*;
import java.util.Scanner;

class EmptyFileException extends Exception {
  public EmptyFileException(String message) {
    super(message);
  }
}

public class EmptyFile{
    void posi(String file) throws FileNotFoundException, EmptyFileException{
        File filenew = new File(file);
        Scanner s = new Scanner(filenew);
            if(!s.hasNextLine()){
                throw new EmptyFileException("File is Empty");
            }
    }
}
