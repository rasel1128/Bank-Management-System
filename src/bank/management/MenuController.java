/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Walton
 */
public class MenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sme_tran(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("SMETransections.fxml"));
          Parent root3;
           root3 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root3));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void transfer(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Transfer.fxml"));
          Parent root4;
           root4 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root4));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void Create(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Create.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root2));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void show_customer(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("ShowCustomer.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root2));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void deposit(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Deposite.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root2));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void withdraw(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("WithdrawMoney.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root2));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    private void sme_cust(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("SMECustomer.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root2));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    private void calculator(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Calculator.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root2));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    private void about(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("About.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root2));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Login.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root2));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
     private static class scene extends Scene {

        public scene(Parent root1) {
            super(root1);
        }
    }
    
}
