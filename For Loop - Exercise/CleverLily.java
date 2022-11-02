package ForLoop.exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double washMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toy = 0;
        double money = 0;
        int brother = 0;

        for(int i = 1; i <= n; i++) {

            if (i%2==0) {
                if(i==2){
                    money=10;
                }else{
                    money += 10.00 * i / 2;
                }
                brother++;
            } else {
                toy++; //toys = toys + 1
            }
        }
        double totalToy = toy*toyPrice;
        double totalMoney = money + totalToy - brother;

        if (washMachine <= totalMoney) {
            System.out.printf("Yes! %.2f", totalMoney-washMachine);
        } else {
            System.out.printf("No! %.2f", washMachine - totalMoney);
        }
    }
}
