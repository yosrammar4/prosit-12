import java.util.*;
import java.util.function.*;
import java.util.stream.*;

// Classe StudentManagement
public class StudentManagement implements Management {

    // Afficher tous les étudiants
    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        students.forEach(con);
    }

    // Afficher les étudiants selon un filtre
    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {
        students.stream().filter(pre).forEach(con);
    }

    // Retourner les noms des étudiants
    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        return students.stream().map(fun).collect(Collectors.joining(", "));
    }

    // Créer un étudiant avec un fournisseur
    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }

    // Trier les étudiants par ID
    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        return students.stream().sorted(com).collect(Collectors.toList());
    }

    // Convertir la liste d'étudiants en flux (stream)
    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return students.stream();
    }
}
