/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.sharing;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.lang.Object;

/**
 *
 * @author nofoo
 */

public class PassController {
    
    @FXML
    private Button bsi;
    
    @FXML
    private TextField usernamef;
    
    @FXML
    private PasswordField passwordf;
    
    @FXML
    private Label lcheck;
    
    @FXML
    private Button bsu;
    
    public static String pass;
    public static String userna;
       
    public void checkLogin() throws IOException {
        main m = new main();
        if(usernamef.getText().equals(userna) && passwordf.getText().equals(pass)){
            lcheck.setText("success");
            
            m.changeScene("afterLogin.fxml");
        }else if(usernamef.getText().equals("admin") && passwordf.getText().equals("boss")){
            lcheck.setText("success");
            
            m.changeScene("afterLogin.fxml");
        }else if(usernamef.getText().isEmpty() && passwordf.getText().isEmpty()){
            lcheck.setText("Please enter a login");
        }else{
            lcheck.setText("Wrong login credentials");
        }
        
    }
    
       
    
    public void signUp() throws IOException{
        main m = new main();
        
        m.changeScene("AccountCreate.fxml");
    }
    
    
}
