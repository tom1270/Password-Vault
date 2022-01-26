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
import javafx.scene.control.TextField;

/**
 *
 * @author nofoo
 */
public class AccountCreateControl {
    
    @FXML
    private Button sub;
    
    @FXML
    public TextField UserCreate;
    
    @FXML
    public PasswordField PassCreate;
    
    @FXML
    private Label pset;
   
    
    public void created() throws IOException{
        main m = new main();
        
        String Username = UserCreate.getText();
        String Password = PassCreate.getText();
        
        int x = 0;
        int f = 0;
        
        //Has to contain a symbol
       if(x == 0){
           int b = 0;
           char[] charSearch = {'!','@','#','$','%','^','&','*','(',')','<','>','?'};
          for(int i=0; i<Password.length(); i++){
                char chr = Password.charAt(i);
            for(int j=0; j<charSearch.length; j++){
                if(charSearch[j] == chr){
                    b++; 
                    f++;
                }
            }  
          }
          if(b == 0){
           pset.setText("Password not valid, has to contain a symbol");
           return;
        }
       }
       
       //7 characters long
       int q = 0;
        for(int i=0; i<Password.length(); i++){
             q++;
             f++;
            }
        int g = 7-q;
        if(q<7){
          pset.setText("Password not valid, "+ g +" more characters are needed");
           return;  
            }
        
        //2 numbers
        int l= 0;

        char [] sample = Password.toCharArray();

        for(int i=0; i<Password.length(); i++){
          char c = Password.charAt(i);
          if(Character.isDigit(Password.charAt(i))){
            l++;
            f++;
          }           

        }

        if(l<2){

          pset.setText("Password not valid, 2 numbers are required");

           return; 

        }

        
        //upper and lowercase letters
        int up = 0;
        int low = 0;
        String AL = "*[A-Z]";
        for (int i = 0; i < Password.length(); i++) {
    
            if(Character.isUpperCase(Password.charAt(i))){    
            up++;
            f++;
            }
            if(Character.isLowerCase(Password.charAt(i))){    
            low++;
            f++;
            } 
          }
        if(up <1 || low <1){
          pset.setText("Password not valid, upper and lowercase letters are required");
           return;  
        }
        
         if(f > 12){
        pset.setText("Password is valid!");
        PassController.pass = Password;
        PassController.userna = Username;
        m.changeScene("Pass_Sharing.fxml");
      }
       System.out.print(Password + " and " + Username);
    }
   
    
    
}
