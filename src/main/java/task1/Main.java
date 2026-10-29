/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {

        // Payment using Credit Card
        PaymentMethod creditCard = new CreditCardPayment();

        EcommerceCart cart1 = new EcommerceCart(creditCard);

        cart1.checkout(2500.00);

        // Payment using JazzCash
        PaymentMethod jazzCash = new JazzCashPayment();

        EcommerceCart cart2 = new EcommerceCart(jazzCash);

        cart2.checkout(1500.00);
    }
}




