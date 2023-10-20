package student.details;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static final String DB_URL = "jdbc:mysql://your_database_host:port/your_database_name";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Anusha@16";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            while (true) {
                printMenu();

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        addStudent(conn, studentList, scanner);
                        break;

                    case 2:
                        viewStudents(conn, studentList);
                        break;

                    case 3:
                        updateStudent(conn, studentList, scanner);
                        break;

                    case 4:
                        deleteStudent(conn, studentList, scanner);
                        break;

                    case 5:
                        searchStudent(conn, studentList, scanner);
                        break;

                    case 6:
                        displayStudentStatistics(studentList);
                        break;

                    case 7:
                        System.out.println("Exiting Student Management System.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nStudent Management System");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Search Student by ID");
        System.out.println("6. Display Student Statistics");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent(Connection conn, ArrayList<Student> studentList, Scanner scanner) {
        try {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter student address: ");
            String address = scanner.nextLine();
            System.out.print("Enter student email: ");
            String email = scanner.next();

            String insertQuery = "INSERT INTO students (name, age, address, email) VALUES (?, ?, ?, ?)";
            PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
            insertStatement.setString(1, name);
            insertStatement.setInt(2, age);
            insertStatement.setString(3, address);
            insertStatement.setString(4, email);

            int affectedRows = insertStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Student added successfully.");
            } else {
                System.out.println("Student addition failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewStudents(Connection conn, ArrayList<Student> studentList) {
        studentList.clear();

        try {
            String selectQuery = "SELECT * FROM students";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String address = resultSet.getString("address");
                String email = resultSet.getString("email");

                Student student = new Student(id, name, age, address, email);
                studentList.add(student);
            }

            if (studentList.isEmpty()) {
                System.out.println("No students to display.");
            } else {
                System.out.println("List of Students:");
                for (Student s : studentList) {
                    System.out.println(s);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
