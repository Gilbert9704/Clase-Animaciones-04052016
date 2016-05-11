/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Carro");
        frame.setSize(new Dimension(1000, 1000));
        frame.add(new Tablero());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
