/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joseibarra.proyect.imc.rmi;

import joseibarra.proyect.imc.rmi.net.Servidor;

/**
 *
 * @author Jose Carlos Ibarra H
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servidor servicio = new Servidor();
        try {
            servicio.iniciar();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        
    }
}
