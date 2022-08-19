public class LogicalOperators {

  public static void main(String[] args) {
    //Logical Operators
    // && -> Logical 'And' Operator  -> Wants Both Conditions True
    // || -> Logical 'Or' Operator   -> Want Atleast One Condition True
    // !  -> Logical 'Not' Operator  -> Makes Ture To False OR False To Ture

    // && -> Logical 'And' Operator
    int a = 55, b = 20;
    if (a < 50 && b < 50) {
      System.out.println("A && B Both Less Than 50");
    }

    // || -> Logical 'Or' Operator
    if (a > 50 || b > 50) {
      System.out.println("A || B least one less than 50");
    }

    // !  -> Logical 'Not' Operator
    boolean isAdult = true;
    if (!isAdult == true) {
      System.out.println("is adult");
    } else {
      System.out.println("not adult");
    }
  }
}
