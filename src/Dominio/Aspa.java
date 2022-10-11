/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.List;


/**
 *Clase que representa la Apuesta.
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Aspa 
{
    /**
     * Lista de las casillas que tiene un aspa.
     */
    private List<Casilla> casillaAspa;

    /**
     * Cantidad de aspas del tablero.
     */
    private int cantidadAspas;

    /**
    *Tablero escogido. 
    */
    protected Tablero tablero;

    /**
     * Constructor Vacío.
     */
    public Aspa() {
    }

    /**
     * Constructor que inicializa los atributos por los valores dados por los
     * parámetros.
     *
     * @param cantidadAspas cantidad de aspas en el tablero.
     */
    public Aspa(int cantidadAspas) {
        this.cantidadAspas = cantidadAspas;
    }

    /**
     * Constructor que inicializa los atributos por los valores dados por los
     * parámetros.
     *
     * @param tablero Tablero de la partida.
     * @param casillaAspa lista de las casillas en una aspa.
     * @param cantidadAspas cantidad de aspas en el tablero.
     */
    public Aspa(List<Casilla> casillaAspa, int cantidadAspas, Tablero tablero) {
        this.casillaAspa = casillaAspa;
        this.cantidadAspas = cantidadAspas;
        this.tablero= tablero;
    }

    /**
     * Método para obtener una lista de las casillas de una aspa.
     */
    public List<Casilla> getCasillaAspa() {
        return casillaAspa;
    }

    /**
     * Método para establecer una lista de las casillas de un aspa.
     *
     * @param casillaAspa Casilla perteneciente a una aspa.
     */
    public void setCasillaAspa(List<Casilla> casillaAspa) {
        this.casillaAspa = casillaAspa;
    }

    /**
     * Método para obtener la cantidad de aspas en un tablero.
     */
    public int getCantidadAspas() {
        return cantidadAspas;
    }

    /**
     * Método para establecer la cantidad de aspas en un tablero.
     *
     * @param cantidadAspas cantidad de las aspas.
     */
    public void setCantidadAspas(int cantidadAspas) {
        this.cantidadAspas = cantidadAspas;
    }

    /**
     * Método para obtener el tablero.
     */
    public Tablero getTablero() {
        return tablero;
    }

    /**
     * Método para establecer el tablero.
     *
     * @param tablero Tablero escogido.
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }


    /**
     * Método que se encarga de regresar una cadena de texto con los datos del 
     *aspa.
     *
     * @return Cadena de texto con atributos de la clase.
     */
    @Override
    public String toString() {
        return "Aspa{" + "Cantidad Casillas=" + casillaAspa + ", Cantidad Aspas=" + cantidadAspas+'}';
    }
    
}
