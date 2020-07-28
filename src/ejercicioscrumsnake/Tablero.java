/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscrumsnake;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Rodrigo
 */
public class Tablero {
    
       
    GridPane tablero;
    
    public Tablero(){
        
        tablero = new GridPane();
        
        
        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 15; j++) {
                Button aux = new Button("000000");
                aux.setStyle("-fx-background-color: grey;");
                
                tablero.add(aux, j, i);
                
            }
        }
        tablero.setPrefSize(700, 700);
    }

    public GridPane getTablero() {
        return tablero;
    }
    
    
    
    
}
