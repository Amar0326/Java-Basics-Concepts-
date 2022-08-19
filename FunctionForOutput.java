import java.util.Scanner;

public class FunctionForOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,x,n;
        System.out.println("Enter A Two Number For Addition");
        s=sc.nextInt();
        x=sc.nextInt();
        n=Add(x, s);
        System.out.println(n);


    }
    public static int Add(int a, int b){
       int m= a+b;
       return m;
    }
}

// class Pur{
   
// }