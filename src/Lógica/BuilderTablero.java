/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import Dominio.Aspa;
import Dominio.Tablero;
import java.awt.Graphics;


/**
 * Clase que construye el tablero de juego
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo# 6
 */
public class BuilderTablero implements BuilderAbstractoTablero{
    protected Tablero tablero;

    /**
     * Metodo de tipo Tablero para ayudar a crear el crear el tlablero.
     * @param numCasillasAspa
     * @return 
     */
    @Override
    public Tablero crearTablero() {
        Tablero tablero = new Tablero();
        Aspa aspas = new Aspa();
        
        return tablero;
        
    }

    /**
     * Va a dibujar en las coordenadas especificadadas el tablero.
     * @param g 
     */
    @Override
    public void dibujar(Graphics g) {
       
    }

}
