import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] arg){
        System.out.println("Podaj swój rocznyh dochód");
        Scanner scanner  = new Scanner(System.in);
        int income = scanner.nextInt();

        double taxToPay;
        if (income < 120000) {
            taxToPay = income * 0.17;
        }
        else if (income < 1000000) {
            taxToPay = 120000 *0.17 + (income - 120000) * 0.32;
        }
        else {
            taxToPay = 120000 *0.17 + 1000000 * 0.36 + (income - 1120000)*3.66;
        }
        System.out.println("Podatek do zapłacenia: " + taxToPay);
    }
}
