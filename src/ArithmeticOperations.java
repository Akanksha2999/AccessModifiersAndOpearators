import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        //Taking two numbers as input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1 = sc.nextInt();

        System.out.print("Enter second number:");
        int n2 = sc.nextInt();

        //Using if loop checking which number is greater than the other number
        if (n1 > n2) {
            System.out.println("Maximum number is:" + n1);
            System.out.println("Minimum number is:" + n2);
        } else {
            System.out.println("Maximum number is:" + n2);
            System.out.println("Minimum number is:" + n1);
        }

        //Initializing variables
        double a = 5;
        double b = 10;
        double c = 6;
        double Ans = 0;

        //Performing arithmetic equations and printing the answer of it
        Ans = a + b * c;
        System.out.println("a+b*c :" + Ans);

        Ans = c + a / b;
        System.out.println("c+a/b :" + Ans);

        Ans = a % b + c;
        System.out.println("a%b+c :" + Ans);

        Ans = a * b + c;
        System.out.println("a*b+c :" + Ans);


    }
}
