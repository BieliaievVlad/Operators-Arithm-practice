package task2;

public class Main {
    static double mornTemp;
    static double noonTemp;
    static double evenTemp;
    static double averageTemp;
    static String measure;
    public static void main(String[] args) {
        mornTemp = 14.5;
        noonTemp = 21.3;
        evenTemp = 17.6;
        measure = "degree(s)";


        averageTemp = (mornTemp+noonTemp+evenTemp)/3;

        System.out.printf("%n1) morning temperature is %.1f %s.", mornTemp, measure);
        System.out.printf("%n2) noon temperature is %.1f %s.", noonTemp, measure);
        System.out.printf("%n3) evening temperature is %.1f %s.", evenTemp, measure);
        System.out.printf("%nAverage day temperature is %.1f %s.", averageTemp, measure);

    }

}
