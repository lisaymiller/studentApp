import java.util.Scanner;

public class Student {

    private String firstName, lastName, studentID;
    private String courses = null;
    private int gradeYear;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.print("1 - FRESHMAN\n2 - SOPHMORE\n3 - JUNIOR\n4 - SENIOR\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }

    // Generate an id
    private void setStudentID() {
        // grade level plus id
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // Enroll in courses
    public void enroll() {
        // get inside a loop, user hits 0 when done
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int pay = in.nextInt();
        tuitionBalance = tuitionBalance - pay;
        System.out.println("Thank you for your payment of $" + pay);
        viewBalance();
    }

    // Status of student; print out
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nStudent ID: " + studentID + "\nGrade year: " + gradeYear
                + "\nCourses enrolled: " + courses + "\nBalance: $" + tuitionBalance;
    }
}