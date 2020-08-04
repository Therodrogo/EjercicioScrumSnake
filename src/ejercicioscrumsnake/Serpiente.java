package ejercicioscrumsnake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Rodrigo
 */
public class Serpiente {

    
    private ArrayList<Integer> posicionX = new ArrayList();
    private ArrayList<Integer> posicionY = new ArrayList();
    
    private int actualX;
    private int actualY;
            
    

    public Serpiente(Integer x,Integer y)
    {
        posicionX.add(x);
        posicionY.add(y);
    }

    public ArrayList<Integer> getPosicionX() {
        return posicionX;
    }

    public ArrayList<Integer> getPosicionY() {
        return posicionY;
    }

    public void setPosicionX(int x) {
        posicionX.add(x);
    }

    public void setPosicionY(int y) {
        posicionY.add(y);
    }
    
    public void posicionActual(int x, int y){
        
        actualX =x;
        actualY =y;
    }

    public int getActualX() {
        return actualX;
    }

    public int getActualY() {
        return actualY;
    }
    
    
    public void imprimir(){
        
        
        for (int i = 0; i < posicionX.size(); i++) {
                
            System.out.println(posicionX.get(i)+" , "+posicionY.get(i));
        }
    }
    
    
    
    
    
    



}
