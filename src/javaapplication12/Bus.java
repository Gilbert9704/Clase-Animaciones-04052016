/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Bus {
    
    private int x;
    private int y;
    
    public void dibujarBus(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x, y, 25, 25);//x,y,ancho,alto
        g.fillOval(x+70, y+20, 25, 25);
        g.drawRect(x, y+20, 100, -25);
        g.drawRect(x+195, y+15, 60, 60);
    }
}
