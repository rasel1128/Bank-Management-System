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
public class CalculatorController implements Initializable {

    @FXML
    private TextField r;
    @FXML
    private TextField n;
    @FXML
    private TextField p;
    @FXML
    private TextField result_i;
    @FXML
    private TextField result_pi;
    @FXML
    private TextField i3;
    @FXML
    private TextField n3;
    @FXML
    private TextField p3;
    @FXML
    private TextField result_rate;
    @FXML
    private TextField i2;
    @FXML
    private TextField r2;
    @FXML
    private TextField p2;
    @FXML
    private TextField result_time;

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
    private void calculate_i(ActionEvent event) {
        String text1 = r.getText();
    String text2 = n.getText();
     String text3 = p.getText();
    Float int1 = Float.parseFloat(text1);
    Float int2 = Float.parseFloat(text2); 
     Float int3 = Float.parseFloat(text3);
    Float result_int;
    // i=pn*(r/100)
        result_int =(int3*int2)*(int1/100);
                //Float result_pri_int;
                // p+n
              //  result_pri_int=(int3+int2);
    result_i.setText(result_int.toString());
     //result_pi.setText(result_pri_int.toString());
   
    }

    @FXML
    private void calculate_rate(ActionEvent event) {
         String text1 = i3.getText();
    String text2 = n3.getText();
     String text3 = p3.getText();
    Float int1 = Float.parseFloat(text1);
    Float int2 = Float.parseFloat(text2); 
     Float int3 = Float.parseFloat(text3);
    Float result_r;
    // r=(i*100)/(p*n)
        result_r =(int1*100)/(int3*int2);
                
     result_rate.setText(result_r.toString());
    }

    @FXML
    private void calculate_time(ActionEvent event) {
         String text1 = i2.getText();
    String text2 = r2.getText();
     String text3 = p2.getText();
    Float int1 = Float.parseFloat(text1);
    Float int2 = Float.parseFloat(text2); 
     Float int3 = Float.parseFloat(text3);
    Float result_t;
    // n=(i*100)/(p*r)
        result_t =(int1*100)/(int3*int2);
                
    result_time.setText(result_t.toString());
     
    }
    private static class scene extends Scene {

        public scene(Parent root2) {
            super(root2);
        }
    } 
    
}
