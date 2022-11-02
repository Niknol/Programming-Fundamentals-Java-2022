package ForLoop.exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //tabs
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            String tabs = scanner.nextLine();

            switch(tabs) {
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;
                default:
                    salary = salary - 0;

                    if (salary <=0){
                        System.out.println("You have lost your salary.");
                    } else {
                        System.out.println(salary);
                    }
            }
        }
    }
}


