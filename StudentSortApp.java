
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSortApp {

    public static void main(String[] args) {
        ArrayList<Student> students = createStudents();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Student ArrayList Sorter ===");

        while (running) {
            System.out.println();
            System.out.println("1. Display students in original order");
            System.out.println("2. Sort students by name");
            System.out.println("3. Sort students by roll number");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    printStudents("Original order", createStudents());
                    break;
                case "2":
                    Selectionsort.sort(students, new Namecomparator());
                    printStudents("Sorted by name", students);
                    break;
                case "3":
                    Selectionsort.sort(students, new Rollnocomparator());
                    printStudents("Sorted by roll number", students);
                    break;
                case "4":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        }

        input.close();
    }

    /** Builds the ArrayList of 10 Student objects in their original order. */
    private static ArrayList<Student> createStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(107, "Maria Lopez", "12 Palm St, Honolulu, HI"));
        students.add(new Student(103, "James Kim", "45 Oak Ave, Hilo, HI"));
        students.add(new Student(110, "Aisha Patel", "78 King St, Kailua, HI"));
        students.add(new Student(101, "Noah Smith", "9 Beach Rd, Kona, HI"));
        students.add(new Student(105, "Emma Johnson", "33 Hill Dr, Pearl City, HI"));
        students.add(new Student(102, "Liam Brown", "21 Lake Ln, Kaneohe, HI"));
        students.add(new Student(109, "Olivia Davis", "56 River Rd, Waipahu, HI"));
        students.add(new Student(104, "Ethan Wilson", "14 Maple Ct, Aiea, HI"));
        students.add(new Student(108, "Sophia Garcia", "62 Pine St, Mililani, HI"));
        students.add(new Student(106, "Lucas Nguyen", "88 Ocean Blvd, Ewa Beach, HI"));
        return students;
    }

    /** Prints a heading, a column header, and every student in the list. */
    private static void printStudents(String title, ArrayList<Student> students) {
        System.out.println();
        System.out.println("--- " + title + " ---");
        System.out.println(String.format("%-8s %-18s %s", "Roll No", "Name", "Address"));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}