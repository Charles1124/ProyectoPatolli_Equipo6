/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;
import Dominio.Ficha;

/**
 *Interfaz que fabrica las fichas con su respectivo color.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo# 6
 */
public interface FabricaAbstractaFichas 
{
    /**
     * Método que fabrica una ficha dependiendo de su color.
     *
     * @return Devuelve una ficha
     */
    public Ficha crearFicha();
}
