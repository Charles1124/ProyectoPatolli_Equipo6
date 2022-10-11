/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.List;

/**
 * Clase que representa al Jugador.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Jugador {

    /**
     * Nombre o nick del jugador.
     */
    private String nombre;

    /**
     * Apuesta ingresada para jugar.
     */
    protected Apuesta apuesta;

    /**
     * Lista de movimientos realizados por un jugador en partida.
     */
    protected List<Movimientos> movimientos;

    /**
     * Constructor Vacío.
     */
    public Jugador() {
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param nombre Nombre o nick del jugador.
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
    } 

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param nombre Nombre o nick del jugador.
     * @param apuesta Apuesta realizada por el jugador.
     * @param movimientos movimientos realizados por el jugador.
     */
    public Jugador(String nombre, Apuesta apuesta, List<Movimientos> movimientos) {
        this.nombre = nombre;
        this.apuesta = apuesta;
        this.movimientos = movimientos;
    }

    /**
     * Método para obtener el nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del jugador.
     *
     * @param nombre Nombre o nick del jugador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la apuesta realizada por el jugador.
     */
    public Apuesta getApuesta() {
        return apuesta;
    }

    /**
     * Método para establecer la apuesta realiza por el jugador.
     *
     * @param apuesta apuesta del jugador.
     */
    public void setApuesta(Apuesta apuesta) {
        this.apuesta = apuesta;
    }

    /**
     * Método para obtener la lista de movimientos realizada por el jugador.
     */
    public List<Movimientos> getMovimientos() {
        return movimientos;
    }

    /**
     * Método para establecer la lista de movimientos realizada por el jugador.
     *
     * @param movimientos movimientos realizados por el jugador.
     */
    public void setMovimientos(List<Movimientos> movimientos) {
        this.movimientos = movimientos;
    }

    /**
     * Método que se encarga de regresar una cadena de texto con los datos del 
     * jugador.
     *
     * @return Cadena de texto con atributos de la clase.
     */
    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + nombre +'}';
    }
    
}
