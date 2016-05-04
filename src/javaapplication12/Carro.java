/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Carro  extends JPanel implements ActionListener{
    
    private Timer timer;
    private int x;
    private int y;
    
    public Carro(){       
        this.timer = new Timer(5, this);
        this.timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(x, y, 25, 25);//x,y,ancho,alto
        g.fillOval(x, y, 25, 25);
        g.drawRect(x, y, 100, -25);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        this.x += 1;
        this.y += 1;
        repaint();
    }
}
