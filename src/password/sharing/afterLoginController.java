/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.sharing;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author nofoo
 */

public class afterLoginController implements Initializable{
    
    @FXML private ObservableList<ALog> data;
    
    @FXML
    private TableView tableViewPeople;

    @FXML
    private TableColumn scol;

    @FXML
    private TableColumn ucol;

    @FXML
    private TableColumn pcol;

    @FXML
    private TableColumn swcol;

    @FXML
    private TextField ufield;

    @FXML
    private TextField pfield;

    @FXML
    private TextField sfield;

    @FXML
    private TextField swfield;

    @FXML
    private Button dp;

    @FXML
    private Button addp;
    
    @FXML
    private Button shareb;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<ALog> data =  
        FXCollections.observableArrayList(
                new ALog("Netflix", "sample", "1234", "sample@gmail.com")
        );
        
       scol.setCellValueFactory(new PropertyValueFactory<ALog, String>("sfield"));
       ucol.setCellValueFactory(new PropertyValueFactory<ALog, String>("ufield"));
       pcol.setCellValueFactory(new PropertyValueFactory<ALog, String>("pfield"));
       swcol.setCellValueFactory(new PropertyValueFactory<ALog, String>("swfield"));
       
       tableViewPeople.setItems(data);
       tableViewPeople.getSortOrder().add(scol);
       tableViewPeople.sort();
        

     //throw new UnsupportedOperationException("Not supported yet."); To change body of generated methods, choose Tools | Templates.
    }
    
   
    public void sharepass() throws IOException{
        main m = new main();
        
        m.changeScene("sharescreen.fxml", 1280, 800);
    }
    
    
    @FXML
    protected void addPass(){
        ObservableList<ALog> data = tableViewPeople.getItems();
        data.add(new ALog(sfield.getText(),
            ufield.getText(),
            pfield.getText(),
            swfield.getText()
        ));
        
        sfield.setText("");
        ufield.setText("");
        pfield.setText("");  
        swfield.setText("");  
    }
    
    @FXML
    protected void deletePass(){
        ALog selectedPerson = (ALog)tableViewPeople.getSelectionModel().getSelectedItem();
        tableViewPeople.getItems().removeAll(selectedPerson);
    }
    
    
}
     
