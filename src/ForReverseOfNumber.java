import java.util.Scanner;

public class ForReverseOfNumber {
    public static void main(String[] args) {

        //Initializing variables
        int num = 0;
        int reversenum = 0;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //For loop to calculate reverse of number
        for (; num != 0; ) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        //Printing the reverse of number
        System.out.println("Reverse of number is:" + reversenum);
    }
}
