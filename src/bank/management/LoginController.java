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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Walton
 */
public class LoginController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private PasswordField pass;
    @FXML
    private TextField user;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sginin(ActionEvent event) throws IOException {
        String dpass = pass.getText().trim();
        String duser = user.getText();
    if ("rasel".equals(duser)) 
    {
       if ("rasel".equals(dpass))
       { 
          FXMLLoader fxmlLoader = new
           FXMLLoader(getClass().getResource("Menu.fxml"));
          Parent root1;
           root1 = (Parent)fxmlLoader.load();
          Stage stage = new Stage();
          stage.setScene(new scene(root1));
           stage.setTitle("UR Online Bank Management");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
       }
       else
       {
        label.setText("Your input Username and Password is Wrong !!!");
       }
    }
    else
    {
       label.setText("Your input Username and Password is Wrong !!!");
    }

    }

    private static class scene extends Scene {

        public scene(Parent root1) {
            super(root1);
        }
    }
    
}
