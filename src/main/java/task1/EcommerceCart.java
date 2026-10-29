/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author DELL
 */
public class EcommerceCart {

    private final PaymentMethod paymentMethod;

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        System.out.println("\nStarting checkout...");

        boolean successful = paymentMethod.pay(amount);

        if (successful) {
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Order could not be placed.");
        }
    }
}