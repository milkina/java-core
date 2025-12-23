package collections.homework;

import java.util.Map;
import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> notes;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public Student(String name, String group, int course, Map<String, Integer> notes) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getNotes() {
        return notes;
    }

    public void setNotes(Map<String, Integer> notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(course, student.course) && Objects.equals(notes, student.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course, notes);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                ", notes=" + notes +
                '}';
    }
}
