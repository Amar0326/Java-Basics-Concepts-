import java.util.Scanner;

public class Input {

  public static void main(String[] args) {

    // How To Take Input From User
    Scanner sc= new Scanner(System.in);


    //Input Of Char
    System.out.println("Are You Young ");
   char Young =sc.next().charAt(0);
    System.out.println(Young);

    //Input Of String Whole Line
    System.out.println("Input Your Full Name :");
    String Line = sc.nextLine(); //NextLine  Takes Whole Line
    System.out.println(Line);

    //Input Of String
    System.out.println("Input Your Name :");
    String Name = sc.next(); //Next Only Takes Tokens Means Scan Single Word
    System.out.println(Name);

    // Input Of Int
    System.out.println("Input Your Age:");
    int age = sc.nextInt();
    System.out.println(age);

    //Input Of Float
    System.out.println("Input Your Age:");
    float age1 = sc.nextFloat();
    System.out.println(age1);

    //Input Of Long
    System.out.println("Input Your Long:");
    long age12 = sc.nextLong();
    System.out.println(age12);

    //Input Of Boolean
    System.out.println("Are You Married");
    boolean Married =sc.nextBoolean();
    System.out.println(Married);
  }
}
