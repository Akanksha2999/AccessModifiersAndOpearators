public class ForSumOfNaturalNumbers {
    public static void main(String[] args) {

        //Initalizing variables
        int Num = 5;
        int n;
        int sum = 0;

        //For loop to calculate sum of natutal numbers
        for (n = 1; n <= Num; n++) {
            sum = sum + n;
        }

        //Printing sum of natutal numbers
        System.out.println("Sum of natural numbers is:" + sum);

    }
}
