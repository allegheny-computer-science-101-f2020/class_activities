package activitythree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
* This class provides a static method that finds the shortest and longest names.
*
* @author Janyl Jumadinova
*/
public class Count {

  /**
  * Count the number of finds of specific word occurrence.
  *
  * @param input the array containing the data
  */
  public static int count(String [] input) {
    int total = 0;
    for (int count = 0; count < input.length; count++) {
      if (input[count].contains("Java")) {
        total++;
      }
    }
    return total;
  }

  /**
  * Calculate the count of specific value occurrence.
  */
  public static void main(String[] args) {

    // declare the starting file and scanner
    File inputFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      // data obtained from https://www.kaggle.com/imoore/60k-stack-overflow-questions-with-quality-rate?select=data.csv
      inputFile = new File("input/data.csv");
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate the input file");
    }

    // declare the variable, using an array
    String [] names = new String[60198];
    for (int count = 0; count < names.length; count++) {
      names[count] = scanner.nextLine();
    }

    int totalCount = Count.count(names);

    System.out.println("  Total count: " + totalCount);
  }
}
