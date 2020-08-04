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
    @FXML
    private Pane paneTablero;
    int x=5;
    int y=5;
    Tablero tablero = new Tablero();
    Serpiente serpiente = new Serpiente(x,y);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
        
        
        
    }    

    @FXML
    private void iniciarjuego(ActionEvent  event) {
        paneTablero.setVisible(true);
        
        //cargar Serpiente
        //tablero.posicionSerpiente(serpiente.getActualX(), serpiente.getActualY());
      
        //cargar Tablero más la serpiente
        paneTablero.getChildren().add(tablero.getTablero());
        
        
        Timer timer = new Timer();
        
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                //System.out.println(cont);
                cont++;
            }
        };
        
        
        timer.schedule(tarea, 0,1000);
        Binicio.setVisible(false);
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void flechasTeclado(KeyEvent event) {
        
        if (event.getCode()== KeyCode.UP) {
            y = y-1;

            serpiente.posicionActual(x, y);
            
            //cargar Serpiente
            try {
                tablero.posicionSerpiente(serpiente.getActualX(), serpiente.getActualY());
                tablero.cambiarTablero(x, y+1);
            } catch (Exception e) {
                System.out.println("Murio Serpiente");
            }
            
            
            //cargar Tablero más la serpiente
            try {
                paneTablero.getChildren().add(tablero.getTablero());
            } catch (Exception e) {
            }
            
        }
        if (event.getCode()== KeyCode.RIGHT) {
            
            x = x+1;
            serpiente.posicionActual(x, y);
            
            //cargar Serpiente
            try {
                tablero.posicionSerpiente(serpiente.getActualX(), serpiente.getActualY());
                tablero.cambiarTablero(x-1, y);
            } catch (Exception e) {
                System.out.println("Murio Serpiente");
            }
            
           
            //cargar Tablero más la serpiente
            try {
                paneTablero.getChildren().add(tablero.getTablero());
            } catch (Exception e) {
            }

        }
        if (event.getCode()== KeyCode.DOWN) {
            
            y = y+1;
            serpiente.posicionActual(x, y);
            
            //cargar Serpiente
            try {
                tablero.posicionSerpiente(serpiente.getActualX(), serpiente.getActualY());
                tablero.cambiarTablero(x, y-1);
            } catch (Exception e) {
                System.out.println("Murio Serpiente");
            }
            
            
            
            //cargar Tablero más la serpiente
            try {
                paneTablero.getChildren().add(tablero.getTablero());
            } catch (Exception e) {
            }

        }
        if (event.getCode()== KeyCode.LEFT) {
            x = x-1;
            serpiente.posicionActual(x, y);
            
            //cargar Serpiente
            try {
                tablero.posicionSerpiente(serpiente.getActualX(), serpiente.getActualY());
                tablero.cambiarTablero(x+1, y);
            } catch (Exception e) {
                System.out.println("Murio Serpiente");
            }
            
            //cargar Tablero más la serpiente
            try {
                paneTablero.getChildren().add(tablero.getTablero());
            } catch (Exception e) {
            }

        }
        
    }
    
    
}
