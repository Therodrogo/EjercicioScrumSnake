/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscrumsnake;

import javafx.scene.shape.Rectangle;

/**
 *
 * @author Rodrigo
 */
public class Manzana {
    double tamañomanzana= 40;
    double posx;
    double posy;
    Rectangle manzana;

    public double getTamañomanzana() {
        return tamañomanzana;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }

    public Rectangle getManzana() {
        manzana.setHeight(getTamañomanzana());
        manzana.setWidth(getTamañomanzana());
        manzana.setX(posx);
        manzana.setY(posy);
        return manzana;
    }

   
    
}
