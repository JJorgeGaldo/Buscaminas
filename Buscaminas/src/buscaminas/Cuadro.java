/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import javax.swing.JButton;

/**
 * En esta clase generamos un boton que puede estar minado o no
 * @author JJGaldo
 */
public class Cuadro extends JButton{
    
    private boolean mina;
    
    public Cuadro (){//declaramos 
        super(); // es para indicar que lo cree como si se tratase de un JButton normal
        double random = Math.random(); // random saca un valor entre 0 y 1
        if (random > 0.85) // se pone el 90% para que pocas casillas sean minadas, nivel fácil
            mina = true;
        else
            mina = false; 
    }
    
    public boolean esta_minado(){
        return mina;
    }
    
}
