package collections.homework;

import java.util.*;

public class StudentExample {
    public static void main(String[] args) {
        Map<String, Integer> notes1 = new HashMap<>();
        notes1.put("Математика", 5);
        notes1.put("Физика", 5);
        notes1.put("Информатика", 5);

        Map<String, Integer> notes2 = new HashMap<>();
        notes2.put("Математика", 2);
        notes2.put("Физика", 2);
        notes2.put("Информатика", 3);

        Map<String, Integer> notes3 = new HashMap<>();
        notes3.put("Математика", 4);
        notes3.put("Физика", 4);
        notes3.put("Информатика", 4);
        Student student1 = new Student("Петров В.В.", "G1", 1, notes1);
        Student student2 = new Student("Иванов И.И.", "G2", 2, notes2);
        Student student3 = new Student("Сидоров С.С.", "G3", 3, notes3);

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println("Все студенты: " + students);
        filter(students);
        System.out.println("Студенты после фильтрации:" + students);
        changeCourse(students);
        System.out.println("Студенты после перевода на другой курс:" + students);

        printStudents(students, 2);
    }

    public static void filter(Set<Student> students) {
        students.removeIf(student -> getAverage(student) < 3);
    }

    public static void changeCourse(Set<Student> students) {
        for (Student student : students) {
            if (getAverage(student) >= 3) {
                int course = student.getCourse();
                student.setCourse(course + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты курса " + course);
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    private static double getAverage(Student student) {
        Collection<Integer> notes = student.getNotes().values();
        double sum = notes.stream().mapToDouble(f -> f).sum();
        return sum / notes.size();
    }
}
