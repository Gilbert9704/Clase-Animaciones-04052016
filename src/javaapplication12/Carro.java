/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;


public class Carro {
    private int x;
    private int y;
    
    public void dibujar(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(x, y+20, 25, 25);//x,y,ancho,alto
        g.fillOval(x+70, y+20, 25, 25);
        g.setColor(Color.BLUE);
        g.drawRect(x, y+20, 100, -25);
        g.drawRect(x-5, y-5, 110, 50);
    }

    public void keyPressed(KeyEvent ke){
        switch (ke.getKeyCode()){
            case KeyEvent.VK_DOWN: y += 10; break;
            case KeyEvent.VK_UP: y -= 10; break;
            case KeyEvent.VK_LEFT: x -= 10; break;
            case KeyEvent.VK_RIGHT: x += 10; break;
        }
        
    }

    public void keyTyped(KeyEvent e){
        
    }

    public void keyReleased(KeyEvent e) {
            
    }
    
    public Rectangle obtenerRectangulo(){
       return new Rectangle(x, y, 20, 20); 
    }
    
}
