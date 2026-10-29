/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task1;

/**
 *
 * @author DELL
 */
public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return false;
        }

        System.out.println("Processing credit card payment of Rs. " + amount);
        System.out.println("Credit card payment successful.");
        return true;
    }
}
