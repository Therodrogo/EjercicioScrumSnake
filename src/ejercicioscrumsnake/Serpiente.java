import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscrumsnake;

/**
 *
 * @author Rodrigo
 */
public class Serpiente {

    public ArrayList<Point> cola = new ArrayList<Point>();
    public int posicionX = 0;
    public int posicionY = 0;

    public Serpiente()
    {
        cola.add(new Point(posicionX,posicionY));
    }
    
    public ArrayList<Point> getCola()
    {
        return cola;
    }

    public void dibujar (Graphics g)
    {
        g.setColor(COLOR.BLUE);

    }
    
    public mover()
    {
            
    }

    public crecer()
    {
        cola.add(new Point());
    }

    public direcciones()
    {
        
    }

}
