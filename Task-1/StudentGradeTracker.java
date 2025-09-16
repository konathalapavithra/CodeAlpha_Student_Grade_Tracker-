package tasks;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    
    // Inner class for Student
    static class Student {
        String name;
        int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name + " - " + grade;
        }
    }

    // Fields
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        System.out.println("=== Welcome to Student Grade Tracker ===");

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Generate Report");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            choice = getIntInput();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> generateReport();
                case 4 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter grade (0-100): ");
        int grade = getIntInput();

        if (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100.");
            return;
        }

        students.add(new Student(name, grade));
        System.out.println("✅ Student added: " + name + " (" + grade + ")");
    }

    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students available.");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }

    private static void generateReport() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students available to generate report.");
            return;
        }

        int total = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
        String topStudent = "", lowStudent = "";

        for (Student s : students) {
            total += s.grade;

            if (s.grade > highest) {
                highest = s.grade;
                topStudent = s.name;
            }
            if (s.grade < lowest) {
                lowest = s.grade;
                lowStudent = s.name;
            }
        }

        double average = (double) total / students.size();

        System.out.println("\n=== Summary Report ===");
        System.out.println("Total Students: " + students.size());
        System.out.println("Average Score : " + String.format("%.2f", average));
        System.out.println("Highest Score : " + highest + " (" + topStudent + ")");
        System.out.println("Lowest Score  : " + lowest + " (" + lowStudent + ")");
        System.out.println("======================");
    }

    private static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("❌ Invalid input. Please enter a number: ");
            }
        }
    }
}

