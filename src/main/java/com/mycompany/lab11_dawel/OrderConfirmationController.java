/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab11_dawel;

import static com.mycompany.lab11_dawel.Order.calcPrice;
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
        foodCost.setText("$" + String.valueOf(calcPrice(foodLabel.getText())));
        drinkCost.setText("$" + String.valueOf(calcPrice(drinkLabel.getText())));
        totalCash.setText("$" + String.valueOf(calcPrice(foodLabel.getText()) + calcPrice(drinkLabel.getText())));
    }
    
}
