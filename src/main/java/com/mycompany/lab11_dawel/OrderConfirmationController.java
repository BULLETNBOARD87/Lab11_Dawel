/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab11_dawel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
/**
 * FXML Controller class
 *
 * @author 2548213
 */
public class OrderConfirmationController implements Initializable {
    
    @FXML
    private Label foodLabel;
    @FXML
    private Label drinkLabel;
    @FXML
    private Label waterLabel;
    @FXML
    private Label specialOrder;
    @FXML
    private Label totalCash;
    @FXML
    private Label foodCost;
    @FXML
    private Label drinkCost;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    
    /**
     * Initializes data from an array of strings.
     * @param strings The array to pull from.
     */
    public void initData(String[] strings) {
        foodLabel.setText(strings[0]);
        drinkLabel.setText(strings[1]);
        waterLabel.setText(strings[2]);
        specialOrder.setText(strings[3]);
        foodCost.setText(String.valueOf(calcPrice(foodLabel.getText())));
        drinkCost.setText(String.valueOf(calcPrice(drinkLabel.getText())));
        totalCash.setText(String.valueOf(calcPrice(foodLabel.getText()) + calcPrice(drinkLabel.getText())));
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
    public double calcPrice(String string) {
        
        double price1 = 0.0;
        double price2 = 0.0;
        
        if (string.equals("Chicken Salad")) {
            price1 = 6.5;
        } else if (string.equals("Turkey Sandwich")) {
            price1 = 6.5;
        } else if (string.equals("Vegetable Wrap")) {
            price1 = 6.0;
        } else if (string.equals("Grilled Cheese")) {
            price1 = 5;
        } else {
            price1 = 0.0;
        }
        
        if (string.equals("Coffee")) {
            price2 = 1.5;
        } else if (string.equals("Tea")) {
            price2 = 1.5;
        } else if (string.equals("Soda")) {
            price2 = 2.0;
        } else if (string.equals("Juice")) {
            price2 = 1.75;
        } else {
            price2 = 0.0;
        }
        
        return price1 + price2;
    }
    
}
