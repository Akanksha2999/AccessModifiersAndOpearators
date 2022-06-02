import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        //Taking day and month number as input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int d = sc.nextInt();

        System.out.print("Enter month: ");
        int m = sc.nextInt();

        //Checking if the entered day and month is between the given range
        boolean isDay = (m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20);

        //Printing the entered day is spring day
        System.out.println("is Spring day: " + isDay);

    }
}
