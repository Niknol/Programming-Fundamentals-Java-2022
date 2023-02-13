package ObjectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age, String town){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown(){
            return this.town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        String inputLine = scanner.nextLine();

        while(!inputLine.equals("end")){
            String[] studentData = inputLine.split("\\s+");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String town = studentData[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentList.add(currentStudent);

            inputLine = scanner.nextLine();
        }

        String hometown = scanner.nextLine();

        for(Student item : studentList){
            if (item.getTown().equals(hometown)) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
