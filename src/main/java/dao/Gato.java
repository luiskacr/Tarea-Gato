/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Steven
 */
@Named(value = "gato")
@RequestScoped
public class Gato {

    /**
     * Creates a new instance of Gato
     */
    public Gato() {
    }
    
}
