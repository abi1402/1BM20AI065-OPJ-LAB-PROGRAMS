import java.util.Scanner;

public class StudentExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] marks = new int[6];
        int total = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 50) {
                throw new RangeException("Marks should be between 0 and 50.");
            }

            total += marks[i];
        }

        double percentage = (double) total / 6;

        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
