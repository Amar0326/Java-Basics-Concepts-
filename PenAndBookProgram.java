import java.util.Scanner;

public class PenAndBookProgram {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Pen =10
    // Book = 40
    // int Pen = 10, Book = 40;

    System.out.println("Enter Your Bank Balance");
    int Amount = sc.nextInt();

    if (Amount >= 50)
     {
      System.out.println("You Can Buy Both book And Pen");
     } 
     
    else if (Amount >= 10 && Amount < 50)
     {
      System.out.println("You Can Buy One Item Only");
     } 

    else
     {
      System.out.println("Get More Money For Shopping");
     }
  }
}
