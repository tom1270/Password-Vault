/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.sharing;
/**
 *
 * @author nofoo
 */

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ESignController {
    
    @FXML
    public TextField eemail;

    @FXML
    public PasswordField epass;

    @FXML
    private Button cso;
    
    @FXML
    private Button sso;
    
    
    public void cancelso() throws IOException{
        main m = new main();
        m.changeScene("sharescreen.fxml");
    }
    
    public void signon() throws IOException{
        main m = new main();
        
        SendEmail.user = eemail.getText();
        SendEmail.pass = epass.getText();
     
        m.changeScene("sharescreen.fxml");
    }
    
}
