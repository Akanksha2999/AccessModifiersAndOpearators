import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args) {

        //Taking x1,x2,y1 and y2 from user as input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of x1,x2,y1,y2:");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        double distance = 0;

        //Calculating distance using distance formula
        distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        //Printing the euclidean distance
        System.out.println("The euclidean distance is:" + distance);
    }
}
