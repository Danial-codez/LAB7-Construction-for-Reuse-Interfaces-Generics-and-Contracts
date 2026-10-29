/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author DELL
 */
public class DataBox<T> {

    private T data;

    public DataBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}