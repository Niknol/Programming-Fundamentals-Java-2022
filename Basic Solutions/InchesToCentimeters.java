package FirstStepsInCoding.lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитане на вход
        double inches = Double.parseDouble(scanner.nextLine());
        // Преобразуване от инчове в сантиметрию
        // 1 инч = 2.54 сантиметра
        double result = inches * 2.54;
        // Принтиране на резултата
        System.out.println(result);
    }
}
