/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Tablero  extends JPanel implements ActionListener, KeyListener{
    
    private Timer timer;
    private Carro c = new Carro();
    private Bus b = new Bus();
    
    public Tablero(){       
        this.timer = new Timer(5, this);
        this.setFocusable(true);
        addKeyListener(this);
        this.timer.start();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        c.dibujar(g);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        validarColisiones();
        repaint();
    }
    
    public void validarColisiones(){
        Rectangle c1 = this.c.obtenerRectangulo();
        //Rectangle b1 = this;
    }
    
    @Override
    public void keyPressed(KeyEvent ke){
        c.keyPressed(ke);
        repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e){
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
            
    }
}
