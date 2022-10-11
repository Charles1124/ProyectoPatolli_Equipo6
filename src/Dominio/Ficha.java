/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 * Clase que representa a una ficha.
 *
 * @author Carlos A. Valle Encinas - David Sotelo Palafox Equipo #6
 */
public class Ficha 
{
    /**
     * Casilla en la que se ubica una ficha.
     */
    protected Casilla casilla; 

    /**
     * Tablero donde las fichas estan en juego.
     */
    protected Tablero tablero; 

    /**
     * Jugador responsable de la ficha.
     */
    protected Jugador jugador; 

    /**
     * Color de la ficha
     */
    private Color color;

    /**
     * Constructor Vacío.
     */
    public Ficha() {
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param color color de la ficha.
     */
    public Ficha(Color color) {
        this.color = color;
    }

    /**
     * Constructor que incializa los atributos por los valores dados por el
     * parámetro.
     *
     * @param color color de la ficha.
     * @param casilla casilla del tablero.
     * @param tablero tablero en juego.
     * @param jugador jugador responsable.
     */
    public Ficha(Casilla casilla, Tablero tablero, Jugador jugador, Color color) {
        this.casilla = casilla;
        this.tablero = tablero;
        this.jugador = jugador;
        this.color = color;
    }

    /**
     * Método que obtiene la casilla donde se ubica la ficha.
     */
    public Casilla getCasilla() {
        return casilla;
    }

    /**
     * Método que establece una casilla donde se ubica la ficha.
     *
     * @param casilla casilla del tablero.
     */
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    /**
     * Método que obtiene el tablero donde las fichas estan en juego.
     */
    public Tablero getTablero() {
        return tablero;
    }

    /**
     * Método que establece el tablero donde las fichas estan en juego.
     *
     * @param tablero tablero en juego.
     */
    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    /**
     * Método que obtiene el jugador responsable de la ficha.
     */
    public Jugador getJugador() {
        return jugador;
    }

    /**
     * Método para establecer el jugador responsable de una ficha.
     *
     * @param jugador jugador responsable.
     */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /**
     * Método que obtiene el color de la ficha.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Método que establece el color de la ficha.
     *
     * @param color color de la ficha.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Método que se encarga de regresar una cadena de texto con los datos de la 
     * ficha.
     *
     * @return Cadena de texto con atributos de la clase.
     */
    @Override
    public String toString() {
        return "Ficha{" + "Color=" + color +'}';
    }
}
