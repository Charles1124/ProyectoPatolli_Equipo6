/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import Dominio.Casilla;
import java.awt.Graphics;

/**
 * Clase que nos ayuda a crear una casilla especial de triangulo.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo# 6
 */
public class FabricaCasillaTriangulo implements FabricaAbstractaCasilla {
     protected Casilla casilla;
    
    /**
     * Este metodo de tipo Casilla va a ayudar a crear una casilla.
     * @param casilla
     * @return 
     */
    @Override
    public Casilla crearCasilla(Casilla casilla) {
        this.casilla = casilla;
        
        return casilla;
    }
    /**
     * Va a dibujar en las coordenadas especificadadas la casilla.
     * @param g 
     */
    @Override
    public void dibujar(Graphics g) {
       
    }
}
