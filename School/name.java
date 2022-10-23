
import java.util.Scanner;

public class leet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int numOfValue = scan.nextInt();
        int sum = 0;
        int product = 1;
        double avarage = 0;

        for(int i = 0; i < numOfValue; i++) {
            System.out.print("Number: ");
            int a = scan.nextInt();
            sum += a;
            product *= a;
        }
        avarage = Double.valueOf(sum);

        System.out.println("Total = " + sum);
        System.out.println("Avarage = " + (avarage / 3));
        System.out.println("Product = " + product);
    }
}
