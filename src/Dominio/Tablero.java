/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.List;

/**
 * Clase que representa al Tablero.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Tablero 
{
    /**
     * Fichas en juego en el Tablero.
     */
    private int fichasJuego; 

    /**
     * Lista de la cantidad de aspas en el tablero.
     */
    protected List<Aspa> aspa;

    /**
     * Lista de la cantidad de casillas en un tablero.
     */
    protected List<Casilla> casillas;

    /**
     * Constructor vacío.
     */
    public Tablero() {
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param fichasJuego fichas en juego.
     */
    public Tablero(int fichasJuego) {
        this.fichasJuego = fichasJuego;
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param fichasJuego fichas en juego.
     * @param aspa lista de las aspas.
     * @param casillas lista de las casillas en un tablero.
     */
    public Tablero(int fichasJuego, List<Aspa> aspa, List<Casilla> casillas) {
        this.fichasJuego = fichasJuego;
        this.aspa = aspa;
        this.casillas = casillas;
    }

    /**
     * Método para obtener las fichas en juego.
     */
    public int getFichasJuego() {
        return fichasJuego;
    }

    /**
     * Método para establecer las fichas en juego.
     *
     * @param fichasJuego fichas en juego.
     */
    public void setFichasJuego(int fichasJuego) {
        this.fichasJuego = fichasJuego;
    }

    /**
     * Método para obtener una lista de las aspas.
     */
    public List<Aspa> getAspa() {
        return aspa;
    }

    /**
     * Método para establecer una lista de las aspas en el tablero.
     *
     * @param aspa lista de las aspas.
     */
    public void setAspa(List<Aspa> aspa) {
        this.aspa = aspa;
    }

    /**
     * Método para obtener una lista de las casillas en un tablero.
     */
    public List<Casilla> getCasillas() {
        return casillas;
    }

    /**
     * Método para establecer una lista de las casillas en un tablero.
     *
     * @param casillas lista de casillas.
     */
    public void setCasillas(List<Casilla> casillas) {
        this.casillas = casillas;
    }

   /**
     * Método que se encarga de regresar una cadena de texto con los datos del 
     * tablero.
     *
     * @return Cadena de texto con atributos de la clase.
     */
    @Override
    public String toString() {
        return "Tablero{" + "Fichas en Juego=" + fichasJuego +'}';
    }
}
