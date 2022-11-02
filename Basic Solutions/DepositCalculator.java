package FirstStepsInCoding.exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Deposit = Double.parseDouble(scanner.nextLine());
        int Months = Integer.parseInt(scanner.nextLine());
        double Percent = Double.parseDouble(scanner.nextLine());

         //double Interest = Deposit * ( Percent / 100);
         //double OneMonthInterest = Interest / 12;
        double result = Deposit + Months * ((Deposit * (Percent / 100)) / 12);

        System.out.println(result);

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        // 1. Изчисляваме натрупаната лихва: 200 * 0.057 (5.7%) = 11.40 лв.
        //2. Изчисляваме лихвата за 1 месец: 11.40 лв. / 12 месеца = 0.95 лв.
        //3. Общата сума е: 200 лв. + 3 * 0.95 лв. = 202.85 лв.
    }
}
