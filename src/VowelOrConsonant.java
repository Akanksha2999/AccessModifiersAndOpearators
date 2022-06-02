import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        //Taking input as alphabet from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabet: ");
        char c = sc.next().charAt(0);

        //Checking if the entered alphabet is vowel or consonant and then printing it
        switch (c) {
            case 'a':
                System.out.println("Is a vowel");
                break;

            case 'e':
                System.out.println("Is a vowel");
                break;

            case 'i':
                System.out.println("Is a vowel");
                break;

            case 'o':
                System.out.println("Is a vowel");
                break;

            case 'u':
                System.out.println("Is a vowel");
                break;

            default:
                System.out.println("Is a consonant");
                break;

        }
    }
}
