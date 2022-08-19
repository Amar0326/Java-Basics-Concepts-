import java.util.Scanner;

public class Calculator {
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Logic L1 =new Logic();
     int a,b,am;
        System.out.println("Enter Two Value");
        L1.a=sc.nextInt();
        L1.b=sc.nextInt();
        // a=sc.nextInt();
        // b=sc.nextInt();
       

      am = Logic.Add(L1.a,L1.b);
    //  L1.Add(L1.a+L1.b);
        
    }
}
class Logic {
    int a ;int b;int c;
    
    public static int Add(int a ,int b)
    {
       System.out.println(a+b);
        return (a+b);
    }
    public static int Sub(int a ,int b)
    {
        return (a-b);
    }
    public static int Mul(int a ,int b)
    {
        return (a*b);
    }
    public static int Div(int a ,int b)
    {
        return (a/b);
    }
}