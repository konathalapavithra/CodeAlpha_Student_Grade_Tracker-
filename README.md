# CodeAlpha_Student_Grade_Tracker-

# 🎓 Student Grade Tracker

A simple yet powerful Java console application to manage student grades. Built with clean code principles and modular design, this project demonstrates core Java skills including object-oriented programming, data structures, input validation, and report generation.

## 🚀 Features

- Add student records with validated grade input
- View all student entries in a formatted list
- Generate a summary report:
  - Total number of students
  - Average score
  - Highest and lowest scores with student names
- Console-based interface for easy interaction
- Robust input handling using `Scanner` and exception management
- Extensible design with inner `Student` class and `ArrayList` for dynamic data storage

## 🛠️ Technologies Used

- Java (JDK 17+ recommended)
- ArrayList for dynamic data management
- Scanner for user input
- Modular methods for clean separation of concerns

## 📦 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-grade-tracker.git
2. Navigate to the project directory:
   cd student-grade-tracker
3. Compile and run the program:
   javac StudentGradeTracker.java
   java StudentGradeTracker

## 📈 Sample Output
=== Welcome to Student Grade Tracker ===

Choose an option:
1. Add Student
2. View All Students
3. Generate Report
4. Exit
Enter choice: 1
Enter student name: Pavithra
Enter grade (0-100): 98
Student added: Pavithra (98)

Choose an option:
1. Add Student
2. View All Students
3. Generate Report
4. Exit
Enter choice: 1
Enter student name: Kavya
Enter grade (0-100): 97
Student added: Kavya (97)

Choose an option:
1. Add Student
2. View All Students
3. Generate Report
4. Exit
Enter choice: 1
Enter student name: Maha
Enter grade (0-100): 92
Student added: Maha (92)

Choose an option:
1. Add Student
2. View All Students
3. Generate Report
4. Exit
Enter choice: 1
Enter student name: Lavanya
Enter grade (0-100): 95
Student added: Lavanya (95)

Choose an option:
1. Add Student
2. View All Students
3. Generate Report
4. Exit
Enter choice: 1
Enter student name: Sireesha
Enter grade (0-100): 90
Student added: Sireesha (90)

Choose an option:
1. Add Student
2. View All Students
3. Generate Report
4. Exit
Enter choice: 2

--- Student List ---
1. Pavithra - 98
2. Kavya - 97
3. Maha - 92
4. Lavanya - 95
5. Sireesha - 90

Choose an option:
1. Add Student
2. View All Students
3. Generate Report
4. Exit
Enter choice: 3
=== Summary Report ===
Total Students: 5
Average Score : 94.40
Highest Score : 98 (Pavithra)
Lowest Score  : 90 (Sireesha)
======================

## 🧠 Future Enhancements
- GUI version using Java Swing or JavaFX
- Support for multiple grades per student
- Grade distribution histogram

