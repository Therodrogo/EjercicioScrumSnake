/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscrumsnake;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author Rodrigo
 */
public class Tablero {
    
       
    GridPane tablero;
    
    public Tablero(){
        
        tablero = new GridPane();
        
        
        for (int i = 0; i < 21; i++) {
            
            for (int j = 0; j < 24; j++) {
                Button aux = new Button("    ");
                aux.setStyle("-fx-background-color: red;");
                Button aux2 = new Button("    ");
                aux2.setStyle("-fx-background-color: white;");
                tablero.add(aux, j, i);
                tablero.add(aux2, j, i);
                
            }
        }
        //tablero.setPrefSize(700, 700);
    }
    
    public void posicionSerpiente(int x,int y){
        
        
        Button serpiente = new Button("    ");
        serpiente.setStyle("-fx-background-color: red;");

        tablero.add(serpiente, x, y);
            
        
        
    }
    
    public GridPane getTablero() {
        return tablero;
    }
    
    public void cambiarTablero(int x,int y){
        
        Button aux = new Button("    ");
        aux.setStyle("-fx-background-color: white;");
        tablero.add(aux, x, y);
    }
    
    
    
    
}
