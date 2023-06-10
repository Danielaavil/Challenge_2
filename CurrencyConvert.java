import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount in Colombian Pesos: ");
        double pesos = scanner.nextDouble();
        
        // Conversion rate as of September 2023: 1 US Dollar = 4282 Colombian Pesos
        double conversionRate = 4282;
        double dollars = pesos / conversionRate;
        
        System.out.println("The equivalent amount in US Dollars is: $" + dollars);
        
        scanner.close();
    }
}
