/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab11_dawel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author super
 */
public class Order {
    
    private static final StringProperty status = new SimpleStringProperty("Initial Text");
        
    public static StringProperty statusProperty() {
        return status;
    }

    public static void setStatus(String newText) {
        status.set(newText);
    }
    
    /**
     * Calculates a price based on listed item.
     * Only works for the following strings:
     * Chicken Salad, Turkey Sandwich, Vegetable Wrap, Grilled Cheese.
     * Coffee, Tea, Soda, Juice.
     * Any other string returns a price of $0.0.
     * @param string The string to calculate the price for.
     * @return The price.
     */
    public static double calcPrice(String string) {

        double price1 = 0.0;
        double price2 = 0.0;
        
        if (string.equals("Chicken Salad")) {
            price1 = 6.50;
        } else if (string.equals("Turkey Sandwich")) {
            price1 = 6.50;
        } else if (string.equals("Vegetable Wrap")) {
            price1 = 6.00;
        } else if (string.equals("Grilled Cheese")) {
            price1 = 5.00;
        } else {
            price1 = 0.00;
        }
        
        if (string.equals("Coffee")) {
            price2 = 1.50;
        } else if (string.equals("Tea")) {
            price2 = 1.50;
        } else if (string.equals("Soda")) {
            price2 = 2.00;
        } else if (string.equals("Juice")) {
            price2 = 1.75;
        } else {
            price2 = 0.00;
        }
        
        return price1 + price2;
    }
    
}
