public class WhileSumOfNaturalNumbers {
    public static void main(String[] args) {

        //Initializing variables
        int Num = 5;
        int n = 1;
        int sum = 0;

        while (n <= Num) {
            //Calculating sum of natural numbers
            sum = sum + n;
            n++;
        }

        //Printing sum of natural numbers
        System.out.println("Sum of natural numbers is:" + sum);

    }
}
