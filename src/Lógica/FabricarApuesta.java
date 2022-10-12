/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import Dominio.Apuesta;

/**
 * Clase encargada de la fabricacion de una apuesta
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo# 6
 */
public class FabricarApuesta implements FabricaAbstractaApuesta{

    /**
     * Se genera la apuesta del jugador especificado
     * @return 
     */
    @Override
    public Apuesta GenerarApuesta() {
        Apuesta apuesta = new Apuesta();
        return apuesta;
    }
    
}
