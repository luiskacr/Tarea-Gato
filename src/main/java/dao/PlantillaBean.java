/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author luis_
 */
@Named(value = "plantillaBean")
@SessionScoped
public class PlantillaBean implements Serializable {

    FacesContext context = FacesContext.getCurrentInstance();
    Jugador jugador = (Jugador) context.getExternalContext().getSessionMap().get("Jugar");

    private String jugador1;
    private String jugador2;

    /**
     * Creates a new instance of PlantillaBean
     */
    public PlantillaBean() {

    }

    public void nombreJugadores() {
        this.jugador1 = "Jugador 1: " + jugador.getNombreJugador1();
        this.jugador2 = "Jugador 2: " + jugador.getNombreJugador2();
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
