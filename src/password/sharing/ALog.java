/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.sharing;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.beans.property.SimpleStringProperty;
import java.lang.String;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author nofoo
 */
public class ALog {

   /* @FXML
    private TableView<?> tableViewPeople;

    @FXML
    private TableColumn<?, ?> scol;

    @FXML
    private TableColumn<?, ?> ucol;

    @FXML
    private TableColumn<?, ?> pcol;

    @FXML
    private TableColumn<?, ?> swcol;

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
*/
    
    private final SimpleStringProperty sfield = new SimpleStringProperty("");
    private final SimpleStringProperty ufield = new SimpleStringProperty("");
    private final SimpleStringProperty pfield = new SimpleStringProperty("");
    private final SimpleStringProperty swfield = new SimpleStringProperty("");
    
     public ALog() {
        this("", "", "", "");
    }
     
     public ALog(String sfield, String ufield, String pfield, String swfield){
         setSfield(sfield);
         setUfield(ufield);
         setPfield(pfield);
         setSwfield(swfield);
         
     }

     
    //Getter and Setter Methods
    public String getUfield() {
        return ufield.get();
    }
    public void setUfield(String usfield) {
        ufield.set(usfield);
    }
    

    public String getPfield() {
        return pfield.get();
    }
    public void setPfield(String psfield) {
        pfield.set(psfield);
    }
    

    public String getSfield() {
        return sfield.get();
    }
     public void setSfield(String ssfield) {
        sfield.set(ssfield);
    }
     

    public String getSwfield() {
        return swfield.get();
    }
    public void setSwfield(String swsfield) {
        swfield.set(swsfield);
    }

}
