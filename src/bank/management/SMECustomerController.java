/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
public class SMECustomerController implements Initializable {

    @FXML
    private TextField loanMoney;
    @FXML
    private TextField name;
    @FXML
    private TextField mother_name;
    @FXML
    private TextField father_name;
    @FXML
    private TextField dateofbirth;
    @FXML
    private TextField nation;
    @FXML
    private TextField religion;
    @FXML
    private TextField gendar;
    @FXML
    private TextField address;
    @FXML
    private TextField acc_num;
    @FXML
    private TextField date;
    @FXML
    private TextField nid;

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
    private void save(ActionEvent event) {
         final String FNAME = acc_num.getText();
		ArrayList<String> list_copy = new ArrayList<>();
                String text1 = loanMoney.getText();
                String text2 = date.getText();
                 String text3 = name.getText();
                String text4 = father_name.getText();
                String text5 = mother_name.getText();
                String text6 = dateofbirth.getText();
                String text7 = nation.getText();
                 String text8 = religion.getText();
                String text9 = gendar.getText();
		String text10 = address.getText();
              
                String text11 = nid.getText();
                list_copy.add (text1);
		list_copy.add (text2);
                list_copy.add (text3);
               
		list_copy.add (text4);
               
                list_copy.add (text5);
               
		list_copy.add (text6);
               
                list_copy.add (text7);
                
		list_copy.add (text8);
                list_copy.add (text9);
                list_copy.add (text10);
              
                list_copy.add (text11);
               
                
		try ( BufferedWriter bw =new BufferedWriter (new FileWriter (FNAME)) ) 
		{			
			for (String line : list_copy) {
				bw.write (line + "\n");
			}
			
			bw.close ();
			
		} catch (IOException e) {
		}

    }
     private static class scene extends Scene {

        public scene(Parent root2) {
            super(root2);
        }
    } 
    
}
