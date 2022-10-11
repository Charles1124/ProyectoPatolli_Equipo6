/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentación;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Clase Fondo que extiende de JPanel que permite colocar una imagen como fondo
 * a un frame deseado.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo#6
 */
public class Fondo extends JPanel
{
    
      private Image imagen; 

    /**
     * Método paint que permite dibujar la imagen así como ajustar su tamaño y
     * poner un opaco el frame o JPanel.
     *
     * @param g: Recibe como parámetro una variable tipo Graphics.
     */
      @Override
      public void paint(Graphics g)
      {
         imagen= new ImageIcon(getClass().getResource("/img/o-ANCIENT-MAYANS-facebook.jpg")).getImage(); 
         g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this); 
         setOpaque(false);
         super.paint(g);
      }    
}
