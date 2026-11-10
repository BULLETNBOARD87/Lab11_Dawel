/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab11_dawel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

import javafx.stage.Modality;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author 2548213
 */
public class OrderController implements Initializable {

    @FXML
    private Button ClearButton;

    @FXML
    private ToggleGroup DrinkGroup;

    @FXML
    private Button OrderButton;

    @FXML
    private MenuItem clearOrderMenu;

    @FXML
    private RadioButton coffeeBtn;

    @FXML
    private MenuItem exitMenu;

    @FXML
    private ListView<String> foodSelection;

    @FXML
    private RadioButton juiceBtn;

    @FXML
    private MenuItem newOrderMenu;

    @FXML
    private Label orderLabel;

    @FXML
    private RadioButton sodaBtn;

    @FXML
    public TextField specialRequestField;

    @FXML
    private RadioButton teaBtn;

    @FXML
    private CheckBox waterRequestButton;

    

    @FXML
    void clearOrder(ActionEvent event) {
        

    }

    @FXML
    void exitInstance(ActionEvent event) {

    }

    @FXML
    void newOrders(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("order.fxml"));
        
        Stage popUpStage = new Stage();
        popUpStage.setTitle("Orderng Application");
        
        popUpStage.setScene(new Scene(root));
        
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        
        popUpStage.show();
       
    }

    @FXML
    void placeButton(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("orderConfirmation.fxml"));
        Parent root = loader.load();
        
        Stage popUpStage = new Stage();
        popUpStage.setTitle("Order Confirmation");
        
        String waterString = "";
        RadioButton selectedRadioButton = (RadioButton) DrinkGroup.getSelectedToggle();
        
        String buttonText = selectedRadioButton.getText();
        
        if (waterRequestButton.isSelected()) {
            waterString = "Yes";
        } else {
            waterString = "No";
        }
        
        OrderConfirmationController receiver = loader.getController();
        String[] strings = {foodSelection.getSelectionModel().getSelectedItem(),
                            buttonText,
                            waterString,
                            specialRequestField.getText()
                            };
        receiver.initData(strings);
        
        popUpStage.setScene(new Scene(root));
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();
        
        

    }

    @FXML
    void resetOrder(ActionEvent event) {

    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] foodArray = {"Chicken Salad", "Turkey Sandwich", "Vegetable Wrap", "Grilled Cheese"};
        ObservableList<String> foods = FXCollections.observableArrayList(foodArray);
        foodSelection.setItems(foods);
    }    

}
