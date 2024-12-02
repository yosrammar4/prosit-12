import java.util.*;

// Classe principale pour tester
public class Main {
    public static void main(String[] args) {
        // Liste d'étudiants
        List<Student> students = Arrays.asList(
            new Student(1, "Alice", 22),
            new Student(2, "Bob", 20),
            new Student(3, "Charlie", 23)
        );

        // Gestionnaire des étudiants
        StudentManagement management = new StudentManagement();

        // Afficher tous les étudiants
        System.out.println("Tous les étudiants :");
        management.displayStudents(students, System.out::println);

        // Afficher les étudiants âgés de plus de 21 ans
        System.out.println("\nÉtudiants âgés de plus de 21 ans :");
        management.displayStudentsByFilter(students, s -> s.getAge() > 21, System.out::println);

        // Retourner les noms des étudiants
        String names = management.returnStudentsNames(students, Student::getName);
        System.out.println("\nNoms des étudiants : " + names);

        // Créer un nouvel étudiant
        Student newStudent = management.createStudent(() -> new Student(4, "Diana", 21));
        System.out.println("\nNouvel étudiant créé : " + newStudent);

        // Trier les étudiants par ID
        List<Student> sortedStudents = management.sortStudentsById(students, Comparator.comparingInt(Student::getId));
        System.out.println("\nÉtudiants triés par ID :");
        sortedStudents.forEach(System.out::println);

        // Convertir la liste en stream et afficher les étudiants
        System.out.println("\nÉtudiants via Stream :");
        management.convertToStream(students).forEach(System.out::println);
    }
}
