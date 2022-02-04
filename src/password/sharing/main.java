/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.sharing;

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author nofoo
 */
public class main extends Application {
    private static Stage stg;
    
    @Override
    public void start(Stage primaryStage) throws IOException{
        stg = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Pass_Sharing.fxml"));
            Button bsi = new Button("Log In");
            TextField usernamef = new TextField();
            TextField passwordf = new TextField();
            Label lcheck = new Label();
            Button bsu = new Button("Sign Up");
            Label pset = new Label();
            Button sub = new Button("Sign Up");
            String ucol, scol, swcol, pcol;
            Button addp = new Button("Add");
            Button dp = new Button("Delete");
            Button shareb = new Button("Share");
            TextField messbox = new TextField();
            TextField rbox = new TextField();
            TextField subjectbox = new TextField();
            Button sendb = new Button("Send");
            Button cancelb = new Button("Cancel");
            Button sie = new Button("Sign into Email");
            TextField eemail = new TextField();
            PasswordField epass = new PasswordField();
            Button cso = new Button ("Cancel");
            Button sso = new Button("Sign in");
        primaryStage.setTitle("Password Keeper");
        primaryStage.setScene(new Scene(root, 640, 379));
        primaryStage.show();
    }
    
   public void changeScene(String fxml, int w, int h) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.setScene(new Scene(pane, w, h));
    }
    
    
    
    
    
/**
* @param args the command line arguments
*/
    public static void main(String[] args){
    launch(args);
}

    
}

