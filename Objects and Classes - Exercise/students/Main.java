package ObjectsAndClasses.exercise.students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String currentStudent = scanner.nextLine();

            String [] dataParts = currentStudent.split(" ");

            String firstName = dataParts[0];
            String secondName = dataParts[1];
            double grade = Double.parseDouble(dataParts[2]);

            Student student = new Student(firstName, secondName, grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for(Student student : studentList){
            System.out.println(student.toString());
        }
    }
}
