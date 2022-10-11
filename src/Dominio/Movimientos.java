/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *Clase que representa los movimientos hechos por un jugador.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Movimientos 
{
    /**
     * Jugador que realiza los movimientos.
     */
    protected Jugador jugador; 

    /**
     * Constructor vacío.
     */
    public Movimientos() {
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param jugador que realiza los movimientos.
     */
    public Movimientos(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Método que obtiene le jugador que realiza la lista de movimientos.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Método que establece al jugador que realiza la lista de movimientos.
     *
     * @param jugador Jugador.
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }   
}
