package Homework9.Exercise2;

public class StudentFormatterExample {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 2, "Physics");
        Student s2 = new Student("Bob", 3, "Computer Science");

        // Lambda 1: "Student Alice, Year 2"
        StudentFormatter simpleFormatter = s -> "Student " + s.name + ", Year " + s.year;

        // Lambda 2: "Alice studies Physics in Year 2"
        StudentFormatter detailedFormatter = s -> s.name + " studies " + s.major + " in Year " + s.year;

        // Ausgabe
        System.out.println(simpleFormatter.format(s1));
        System.out.println(detailedFormatter.format(s1));

        System.out.println(simpleFormatter.format(s2));
        System.out.println(detailedFormatter.format(s2));
    }

}
