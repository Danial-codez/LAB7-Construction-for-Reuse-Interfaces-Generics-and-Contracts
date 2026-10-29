/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task4;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, 3.50));
        students.add(new Student(101, 3.20));
        students.add(new Student(102, 3.80));

        System.out.println("Original Student List:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by roll number in ascending order
        Collections.sort(students);

        System.out.println("\nSorted by Roll Number (Ascending):");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by CGPA in descending order
        Collections.sort(students, new CgpaComparator());

        System.out.println("\nSorted by CGPA (Descending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}