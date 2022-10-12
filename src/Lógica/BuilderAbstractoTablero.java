/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lógica;

import Dominio.Tablero;
import java.awt.Graphics;

/**
 * Interfaz que fabrica el tablero segun el tamano.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo# 6
 */
public interface BuilderAbstractoTablero {
    
    /**
     * Método que crea un tablero dependiendo de su numero de aspas y sus coordenadas.
     * @return Devuelve una tablero
     */
    public Tablero crearTablero();
    /**
     * Se encarga de dibujar el tablero con la libreria de java.
     * @param g a gráfico a dibujar
     */
    public void dibujar(Graphics g);
}
