package AssociativeArrays.exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentsGrade = new LinkedHashMap<>();

        for (int student = 1; student <= n; student++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!studentsGrade.containsKey(studentName)){
                studentsGrade.put(studentName, new ArrayList<>());
            }
            studentsGrade.get(studentName).add(grade);
        }

        Map<String, Double> averageStudentGrade = new LinkedHashMap<>();
        for(Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()){
            String name = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double averageGrade = getAverageGrade(listGrades);
            if(averageGrade >= 4.50){
                averageStudentGrade.put(name, averageGrade);
            }
        }
        averageStudentGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrades = 0;
        for (double grade : listGrades){
            sumGrades += grade;
        }
        return sumGrades / listGrades.size();
    }
}
