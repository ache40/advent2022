import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static int part1() throws FileNotFoundException {
    File file = new File("day1input.txt");
    Scanner input = new Scanner(file);
    String line = "";
    int current = 0;
    int best = 0;
    while(input.hasNextLine()) {
      line = input.nextLine();
      if(line.equals("") || line.equals(" ")) {
        if(current > best) {
          best = current;
        }
      }
    }
  }
  public static void main(String[] args) {

  }
}
