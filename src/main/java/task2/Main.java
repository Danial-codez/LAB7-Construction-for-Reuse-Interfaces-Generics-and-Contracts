/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {

        // DataBox storing a student's name
        DataBox<String> nameBox = new DataBox<>("Danial");

        // DataBox storing a student's ID
        DataBox<Integer> idBox = new DataBox<>(12345);

        // Display the stored data
        System.out.println("Student Name: " + nameBox.getData());
        System.out.println("Student ID: " + idBox.getData());
    }
}
