package routis.examples.jacksondemo;

import java.util.Map;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private Map<String, String> classGrades;

    public Student(){}

    public Student(String firstName, String lastName, Map<String, String> classGrades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classGrades = classGrades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(classGrades, student.classGrades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, classGrades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classGrades=" + classGrades +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, String> getClassGrades() {
        return classGrades;
    }

    public void setClassGrades(Map<String, String> classGrades) {
        this.classGrades = classGrades;
    }
}