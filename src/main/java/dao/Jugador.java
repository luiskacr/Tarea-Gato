
package dao;

/**
 * @author Steven
 */
public class Jugador {
    private String nombreJugador;
    private int Puntaje;
    private char TipoFicha; 

    public Jugador(String nombreJugador, int Puntaje, char TipoFicha) {
        this.nombreJugador = nombreJugador;
        this.Puntaje = Puntaje;
        this.TipoFicha = TipoFicha;
    }

    public Jugador() {
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int Puntaje) {
        this.Puntaje = Puntaje;
    }

    public char getTipoFicha() {
        return TipoFicha;
    }

    public void setTipoFicha(char TipoFicha) {
        this.TipoFicha = TipoFicha;
    }    
    
}
