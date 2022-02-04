/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.sharing;

import com.sun.javafx.logging.PlatformLogger.Level;
import com.sun.mail.smtp.SMTPTransport;
import java.io.IOException;
import static java.lang.ProcessBuilder.Redirect.to;
import java.lang.System.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.util.*;
import javafx.scene.control.Button;
import javax.mail.*;
import java.util.Properties;
import javafx.scene.control.Label;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author nofoo
 */
public class ShareScreenController {

    
    @FXML
    private TextField messbox;

    @FXML
    private TextField rbox;

    @FXML
    private TextField subjectbox;
    
    @FXML
    private Button sendb;
    
    @FXML
    private Button cancelb;
    
    @FXML
    private Button sie;

    @FXML
    public Label sil;
    
    
    public void SIE() throws IOException{
        main m = new main();
        m.changeScene("esignon.fxml", 640, 400);
    }
    
    public void sents() throws IOException{
        SendEmail SE = new SendEmail(rbox.getText(), subjectbox.getText(), messbox.getText());
        
        main m = new main();
        m.changeScene("afterLogin.fxml", 1064, 632);
    }
    
    public void cancelsend() throws IOException{
        main m = new main();
        m.changeScene("afterLogin.fxml", 1064, 632);
    }
    
}
    
    
    

