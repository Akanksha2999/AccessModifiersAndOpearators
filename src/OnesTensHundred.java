public class OnesTensHundred {
    public static void main(String[] args) {

        //Initializing variable n
        int n = 1101001000;

        /*Calculation for getting the digit at ones, tens and hundred place*/
        int one = (n / 1) % 10;
        int tens = (n / 10) % 10;
        int hundred = (n / 100) % 10;

        //Printing the digits
        System.out.println("Ones place digit is:" + one);
        System.out.println("Tens place digit:" + tens);
        System.out.println("Hundred place digit is:" + hundred);
    }
}
