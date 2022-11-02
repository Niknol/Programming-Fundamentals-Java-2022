package FirstStepsInCoding.lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитане на входни данни
        String architectName = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        // Изчисления
        int neededTime = projects * 3;
        // Печатане на резултат
        //"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, neededTime, projects);
    }
}
