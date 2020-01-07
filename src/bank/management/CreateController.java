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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Walton
 */
public class CreateController implements Initializable {

    @FXML
    private TextField name;
    private TextField mother_name;
    @FXML
    private TextField father_name;
    @FXML
    private TextField date;
    @FXML
    private TextField nation;
    @FXML
    private TextField religion;
    @FXML
    private TextField gendar;
    @FXML
    private TextField address;
    @FXML
    private TextField ac_num;
    @FXML
    private TextField ac_type;
    @FXML
    private TextField id;
    @FXML
    private TextField password;
    @FXML
    private Label msg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Connection conn;
        Statement stat;
        ResultSet rs;
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
        try{
         Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/rasel","root","");
         String sql="INSERT INTO raseltable VALUES ('"+id.getText()+"', '"+name.getText()+"', '"+father_name.getText()+"', '"+password.getText()+"')";
      Statement Statement=conn.createStatement();
         Statement.executeUpdate(sql);
          msg.setText("Inserted");
        }
          catch (SQLException e) {
            msg.setText("Already Inserted or error Something");
        }
       /** try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:resource:create.db");
            Statement stat = conn.createStatement();
               
                String text1 = name.getText();
                String text2 = father_name.getText();
                String text3 = mother_name.getText();
                String text4 = date.getText();
                String text5 = nation.getText();
                String text6 = religion.getText();
                String text7 = gendar.getText();
                String text8 = address.getText();
                String text9 =ac_type.getText();
                
                stat.execute("insert into Create_Account(DepositeMoney,Dtae,Name,FatherName,MotherName,Dateofbirth,Nationality,Religion,Gender,Address,AccountNum,AccountType) valuse ('"+text1+",'"+text2+",'"+text3+",'"+text4+",'"+text5+",'"+text6+",'"+text7+",'"+text8+",'"+text9+",)");
                
        } catch (SQLException ex) {
            Logger.getLogger(CreateController.class.getName()).log(Level.SEVERE, null, ex);
        }
        **/
	}
    
     private static class scene extends Scene {

        public scene(Parent root2) {
            super(root2);
        }
    }
}
