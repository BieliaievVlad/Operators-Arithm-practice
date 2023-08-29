package task3;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    static Scanner scanner;
    static String measure = "pcs.";
    static  String CURRENCY = "USD";

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Enter product name: ");

        String prodName = scanner.nextLine();

        System.out.print("Enter product quantity: ");

        int prodQuantity = scanner.nextInt();

        System.out.print("Enter product price: ");

        double prodPrice = scanner.nextDouble();

        double prodCost = prodPrice * prodQuantity;

        System.out.printf("%nInput product name: %s" +
                "%nInput product quantity, %s: %d" +
                "%nInput product price, %s: %.2f" +
                "%nCost of %s is %s %.2f.", prodName, measure, prodQuantity,
                CURRENCY, prodPrice, prodName, CURRENCY, prodCost);


        scanner.close();










    }

}
