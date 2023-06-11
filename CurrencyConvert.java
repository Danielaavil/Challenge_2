import java.util.Scanner;
public class CurrencyConvert {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in Colombia Pesos: ");
        double pesos = scanner.nextDouble();

        //Conversion rate as of June 2023 = 4198 Colombian Pesos

        double conversionRate = 4100;
        double dollars = pesos / conversionRate;

        System.out.println("The equivalent amount in us dollars is: " + dollars);

        scanner.close();
    }
}