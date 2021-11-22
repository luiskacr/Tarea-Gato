/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Steven
 */
@Named(value = "gato")
@SessionScoped
public class Gato extends Juego implements Serializable {

    private int turno = 0;
    private int id;

    private String position0;
    private char position1;
    private char position2;
    private char position3;
    private char position4;
    private char position5;
    private char position6;
    private char position7;
    private char position8;

    private boolean boton0 = false;
    private boolean boton1 = false;
    private boolean boton2 = false;
    private boolean boton3 = false;
    private boolean boton4 = false;
    private boolean boton5 = false;
    private boolean boton6 = false;
    private boolean boton7 = false;
    private boolean boton8 = false;

    /**
     * Creates a new instance of Gato
     */
    public Gato() {
    }

    public void pressButton0() {

        if (this.turno == 8) {
            empate();
        } else if (this.turno % 2 == 0) {
            this.boton0 = true;
            this.position0 = "X";
            juego[0][0] = 'X';
            validarTurno();
        } else {
            this.boton0 = true;
            this.position0 = "O";
            juego[0][0] = 'O';
            validarTurno();
        }
        this.turno++;
    }

    public void pressButton1() {

        if (this.turno == 8) {
            empate();
        } else if (this.turno % 2 == 0) {
            this.boton1 = true;
            this.position1 = 'X';
            juego[0][1] = 'X';
            validarTurno();
        } else {
            this.boton1 = true;
            this.position1 = 'O';
            juego[0][1] = 'O';
            validarTurno();
        }
        this.turno++;
    }

    public void pressButton2() {

        if (this.turno == 8) {
            empate();
        } else if (this.turno % 2 == 0) {
            this.boton2 = true;
            this.position2 = 'X';
            juego[0][2] = 'X';
            validarTurno();
        } else {
            this.boton2 = true;
            this.position2 = 'O';
            juego[0][2] = 'O';
            validarTurno();
        }
        this.turno++;
    }

    public void pressButton3() {

        if (this.turno == 8) {
            empate();
        } else if (this.turno % 2 == 0) {
            this.boton3 = true;
            this.position3 = 'X';
            juego[1][0] = 'X';
            validarTurno();
        } else {
            this.boton3 = true;
            this.position3 = 'O';
            juego[1][0] = 'O';
            validarTurno();
        }
        this.turno++;
    }

    public void pressButton4() {

        if (this.turno == 8) {
            empate();
        } else if (this.turno % 2 == 0) {
            this.boton4 = true;
            this.position4 = 'X';
            juego[1][1] = 'X';
            validarTurno();
        } else {
            this.boton4 = true;
            this.position4 = 'O';
            juego[1][1] = 'O';
            validarTurno();
        }
        this.turno++;
    }

    public void pressButton5() {

        if (this.turno == 8) {
            empate();
        } else if (this.turno % 2 == 0) {
            this.boton5 = true;
            this.position5 = 'X';
            juego[1][2] = 'X';
            validarTurno();
        } else {
            this.boton5 = true;
            this.position5 = 'O';
            juego[1][2] = 'O';
            validarTurno();
        }
        this.turno++;
    }

    public void pressButton6() {

        if (this.turno == 8) {
            empate();
        } else if (this.turno % 2 == 0) {
            this.boton6 = true;
            this.position6 = 'X';
            juego[2][0] = 'X';
            validarTurno();
        } else {
            this.boton6 = true;
            this.position6 = 'O';
            juego[2][0] = 'O';
            validarTurno();
        }
        this.turno++;
    }

    public void pressButton7() {

        if (this.turno == 8) {
            empate();
        } else if (this.turno % 2 == 0) {
            this.boton7 = true;
            this.position7 = 'X';
            juego[2][1] = 'X';
            validarTurno();
        } else {
            this.boton7 = true;
            this.position7 = 'O';
            juego[2][1] = 'O';
            validarTurno();
        }
        this.turno++;
    }

    public void pressButton8() {

        if (this.turno == 8) {
            empate();
        } else if (this.turno % 2 == 0) {
            this.boton8 = true;
            this.position8 = 'X';
            juego[2][2] = 'X';
            validarTurno();
        } else {
            this.boton8 = true;
            this.position8 = 'O';
            juego[2][2] = 'O';
            validarTurno();
        }
        this.turno++;
    }

    public void empate() {
        try {
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

            FacesContext.getCurrentInstance().getExternalContext().redirect("empate.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(Gato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void validarTurno() {
        if (validaturno() == true) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
                FacesContext.getCurrentInstance().getExternalContext().redirect("ganador.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(Gato.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }

    }

    public String terminar() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index";
    };

    public String getPosition0() {
        return position0;
    }

    public void setPosition0(String position0) {
        this.position0 = position0;
    }

    public char getPosition1() {
        return position1;
    }

    public void setPosition1(char position1) {
        this.position1 = position1;
    }

    public char getPosition2() {
        return position2;
    }

    public void setPosition2(char position2) {
        this.position2 = position2;
    }

    public char getPosition3() {
        return position3;
    }

    public void setPosition3(char position3) {
        this.position3 = position3;
    }

    public char getPosition4() {
        return position4;
    }

    public void setPosition4(char position4) {
        this.position4 = position4;
    }

    public char getPosition5() {
        return position5;
    }

    public void setPosition5(char position5) {
        this.position5 = position5;
    }

    public char getPosition6() {
        return position6;
    }

    public void setPosition6(char position6) {
        this.position6 = position6;
    }

    public char getPosition7() {
        return position7;
    }

    public void setPosition7(char position7) {
        this.position7 = position7;
    }

    public char getPosition8() {
        return position8;
    }

    public void setPosition8(char position8) {
        this.position8 = position8;
    }

    public boolean isBoton0() {
        return boton0;
    }

    public void setBoton0(boolean boton0) {
        this.boton0 = boton0;
    }

    public boolean isBoton1() {
        return boton1;
    }

    public void setBoton1(boolean boton1) {
        this.boton1 = boton1;
    }

    public boolean isBoton2() {
        return boton2;
    }

    public void setBoton2(boolean boton2) {
        this.boton2 = boton2;
    }

    public boolean isBoton3() {
        return boton3;
    }

    public void setBoton3(boolean boton3) {
        this.boton3 = boton3;
    }

    public boolean isBoton4() {
        return boton4;
    }

    public void setBoton4(boolean boton4) {
        this.boton4 = boton4;
    }

    public boolean isBoton5() {
        return boton5;
    }

    public void setBoton5(boolean boton5) {
        this.boton5 = boton5;
    }

    public boolean isBoton6() {
        return boton6;
    }

    public void setBoton6(boolean boton6) {
        this.boton6 = boton6;
    }

    public boolean isBoton7() {
        return boton7;
    }

    public void setBoton7(boolean boton7) {
        this.boton7 = boton7;
    }

    public boolean isBoton8() {
        return boton8;
    }

    public void setBoton8(boolean boton8) {
        this.boton8 = boton8;
    }

}
