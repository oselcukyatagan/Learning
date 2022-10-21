package newPack;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("first variable: ");
        float x = scan.nextFloat();
        System.out.println("second variable: ");
        float y = scan.nextFloat();

        float perimeter = 2 * (x + y);
        float area = x * y;

        System.out.println("Perimeter = "+ perimeter);
        System.out.println("Area = "+ area);
    }
}
