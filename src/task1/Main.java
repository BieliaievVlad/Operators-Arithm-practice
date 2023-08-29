package task1;

public class Main {
    static String prodName;
    static String prodMeasure;
    static String CURRENCY = "EUR";
    static double prodQuantity;
    static double prodCost;
    static double totalCost;

    public static void main(String[] args) {
        prodName = "Orange";
        prodCost = 2.59 ;
        prodMeasure = "kg";
        prodQuantity = 59.329;

        totalCost = prodCost * prodQuantity;

        System.out.printf("%nProduct: %s, sold %.3f %s, total cost is %s %.2f"
        , prodName, prodQuantity, prodMeasure, CURRENCY, totalCost );



    }

}
