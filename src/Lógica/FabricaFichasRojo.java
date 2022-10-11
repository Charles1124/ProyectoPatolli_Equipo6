/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import Dominio.Color;
import Dominio.Ficha;

/**
 * Clase que implementa la interfaz que fabrica las fichas de color rojo.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo# 6
 */
public class FabricaFichasRojo implements FabricaAbstractaFichas{
    
    /**
     * Método que crea una ficha de color rojo.
     *
     * @return Devuelve la ficha creada
     */
    @Override
    public Ficha crearFicha() {
        Color color1 = Color.ROJO;
        Ficha ficha1 = new Ficha(color1);
        return ficha1;
    }
}
