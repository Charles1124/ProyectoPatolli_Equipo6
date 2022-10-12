/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lógica;

import Dominio.Casilla;
import java.awt.Graphics;



/**
 * Interfaz que construye la casilla segun las coordenadas.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo# 6
 */
public interface FabricaAbstractaCasilla {
    /**
     * Método que fabrica una casilla dependiendo de su coordenada.
     * @param casilla La casilla para fabricar
     * @return Devuelve una casilla
     */
    public Casilla crearCasilla(Casilla casilla);
    /**
     * Se encarga de dibujar la casilla con la libreria de java.
     * @param g 
     */
    public void dibujar(Graphics g);
    
}
