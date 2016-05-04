/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Carro  extends JPanel implements ActionListener, KeyListener{
    
    private Timer timer;
    private int x;
    private int y;
    
    public Carro(){       
        this.timer = new Timer(5, this);
        this.setFocusable(true);
        addKeyListener(this);
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
        
    }
    
    @Override
    public void keyPressed(KeyEvent ke){
        switch (ke.getKeyCode()){
            case KeyEvent.VK_DOWN: y += 10; break;
            case KeyEvent.VK_UP: y -= 10; break;
            case KeyEvent.VK_LEFT: x -= 10; break;
            case KeyEvent.VK_RIGHT: x += 10; break;
        }
        repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e){
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
            
    }
}
