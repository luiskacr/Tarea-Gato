/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author luis_
 */
@Named(value = "inicioJuego")
@RequestScoped
public class InicioJuego {
    Jugador jugador = new Jugador();
    private String jugador1;
    private String jugador2;
    /**
     * Creates a new instance of inicioJuego
     */
    public InicioJuego() {
    }
    
    
    public String iniciar(){
        jugador.setNombreJugador1(jugador1);
        jugador.setNombreJugador2(jugador2);
        if(jugador.getNombreJugador1().isEmpty() || jugador.getNombreJugador2().isEmpty() ){
            return null;
        }else{
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("Jugar", jugador);
            return "juego.xhtml";
        }
       
    };

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }
    
    
    
}
