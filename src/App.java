import java.util.Scanner;

class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return name + " : " + grade;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students?: ");
        int num = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        Student[] students = new Student[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter details for student #" + (i + 1));

            System.out.print("Enter the name: ");
            String name = sc.nextLine();

            System.out.print("Enter grade: ");
            double grade = sc.nextDouble();
            sc.nextLine(); // Consume the newline after double input

            students[i] = new Student(name, grade);
        }

        // Bubble sort students by grade in ascending order
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].grade > students[j + 1].grade) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted list of students by grade: ");
        for (Student student : students) {
            System.out.println(student);
        }

        
    }
}
