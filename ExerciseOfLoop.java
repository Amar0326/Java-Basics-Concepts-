import java.util.Scanner;

public class ExerciseOfLoop {

  public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);
    int number=0;

    do {
        System.out.println("Enter A Number:");
        number = sr.nextInt();
        System.out.print("Here Is Your Number:");
        System.out.println(number);
        
    } while (number >= 0);
    System.out.println("End Of Program");
  }
}
