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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Walton
 */
public class DepositeController implements Initializable {

    @FXML
    private TextField balance;
    @FXML
    private TextField deposite;
    @FXML
    private TextField total_balance;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back_main(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Menu.fxml"));
          Parent root2;
           root2 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root2));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void save_total(ActionEvent event) {
         String text1 = balance.getText();
    String text2 = deposite.getText();
    Float int1 = Float.parseFloat(text1);
    Float int2 = Float.parseFloat(text2); 
    Float result_total;
    // r=(i*100)/(p*n)
        result_total =(int1+int2);
                
     total_balance.setText(result_total.toString());
    }
    
    private static class scene extends Scene {

        public scene(Parent root2) {
            super(root2);
        }
    } 
}
