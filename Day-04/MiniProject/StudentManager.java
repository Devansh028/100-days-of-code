package MiniProject;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println(" Student added successfully!");
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students yet.");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            s.printDetails();
        }
    }

    public void showTopper() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student topper = students.get(0);
        for (Student s : students) {
            if (s.getAverage() > topper.getAverage()) {
                topper = s;
            }
        }

        System.out.println("\n🎉 Topper: " + topper.getName());
        System.out.println("Average: " + topper.getAverage());
    }
}
