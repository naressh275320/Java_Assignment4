package ExceptionalHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PositiveNumber {
  public void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    // Read and process the contents of the file
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
    }
    scanner.close();
  }
}
