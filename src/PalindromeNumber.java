import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        //Initializing variables
        int num = 0;
        int reversenum = 0;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //Assigning number to variable c
        int c = num;

        //For loop to reverse the number
        for (; num != 0; ) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        //Checking if the reversed number is equal to c
        if (c == reversenum) {

            //Printing the number is palindrome
            System.out.println("It's a Palindrome Number");
        } else {
            //Printing the number is not palindrome
            System.out.println("It's not a Palindrome Number");
        }
    }
}
