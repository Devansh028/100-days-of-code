package MiniProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n=== Student Grade Manager ===");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Show Topper");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter number of subjects: ");
                    int n = sc.nextInt();

                    int[] marks = new int[n];
                    System.out.println("Enter marks:");
                    for (int i = 0; i < n; i++)
                        marks[i] = sc.nextInt();

                    manager.addStudent(new Student(name, marks));
                    break;

                case 2:
                    manager.showAllStudents();
                    break;

                case 3:
                    manager.showTopper();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
