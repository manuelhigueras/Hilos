/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hilos;

/**
 *
 * @author user
 */
public class HilosPrueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Saludor s = new Saludor();
        Thread h1 = new Thread(s);
        h1.start();
        
        Thread h2 = new Thread(new Saludador2());
        h2.start();
    }
    
}
