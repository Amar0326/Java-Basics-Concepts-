import java.util.Scanner;

public class FunctionMethod {

    public static void PrintJava(int a,int b)
    { System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        // System.out.println("Hellow ");
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        PrintJava(a,b);
        
    }
    
}
