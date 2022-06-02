import java.util.Scanner;

public class MonthNameFromNumber {
    public static void main(String[] args) {
        //Taking number from user as input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //Checking if the entered number is between 1 to 12 and printing the month name
        switch (n) {
            case 1:
                System.out.println("It is january");
                break;

            case 2:
                System.out.println("It is february");
                break;

            case 3:
                System.out.println("It is march");
                break;

            case 4:
                System.out.println("It is april");
                break;

            case 5:
                System.out.println("It is may");
                break;

            case 6:
                System.out.println("It is june");
                break;

            case 7:
                System.out.println("It is july");
                break;

            case 8:
                System.out.println("It is august");
                break;

            case 9:
                System.out.println("It is september");
                break;

            case 10:
                System.out.println("It is october");
                break;

            case 11:
                System.out.println("It is november");
                break;

            case 12:
                System.out.println("It is december");
                break;

            default:
                System.out.println("Invalid month.");
                break;


        }
    }
}
