/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lógica;

import Dominio.Apuesta;

/**
 * Interface que nos ayuda a generar la apuesta del jugador.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo# 6
 */
public interface FabricaAbstractaApuesta {
    /**
     * Genera la apuesta correspondiente al jugador que la solicito
     * @return Apuesta
     */
    public Apuesta GenerarApuesta();
    
}
