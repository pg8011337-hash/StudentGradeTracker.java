import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 🔹 Input and store grades
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks.add(sc.nextInt());
        }

        // 🔹 Calculate values
        int sum = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        for (int mark : marks) {
            sum += mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark < lowest) {
                lowest = mark;
            }
        }

        double average = (double) sum / marks.size();

        // 🔹 Summary Report
        System.out.println("\n===== Student Summary Report =====");

        for (int i = 0; i < marks.size(); i++) {
            System.out.println("Student " + (i + 1) + " Marks: " + marks.get(i));
        }

        System.out.println("----------------------------------");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}
