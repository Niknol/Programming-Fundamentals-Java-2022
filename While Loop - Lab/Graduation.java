package WhileLoop.lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int grade = 1;
        int poorGrade = 0;
        double allGrades = 0;
        while (grade <= 12) {
            double yearGrade = Double.parseDouble(scanner.nextLine());

            if (yearGrade >= 4.00){
                allGrades += yearGrade;
                poorGrade = 0;
                grade++;
            } else {
                poorGrade++;
                if (poorGrade>1){
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    break;
                }
            }

        }
        if(grade > 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, allGrades/12 );
        }
    }
}

