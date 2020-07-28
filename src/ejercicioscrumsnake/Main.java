/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscrumsnake;

import static com.sun.java.accessibility.util.EventID.KEY;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Rodrigo
 */
public class Main implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private AnchorPane anchor;
    
    
    
    int cont=0;
    @FXML
    private Label puntaje;
    @FXML
    private Pane Tablero;
    @FXML
    private Button Binicio;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
        
        
        
    }    

    @FXML
    private void iniciarjuego(ActionEvent event) {
        Timer timer = new Timer();
        
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                System.out.println(cont);
                cont++;
            }
        };
        
        
        timer.schedule(tarea, 0,1000);
        Binicio.setVisible(false);
    }

    
}
