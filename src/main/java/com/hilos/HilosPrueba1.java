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
public class HilosPrueba1 {
    public static void main(String[] args) {
        
        System.out.println("INICIO");
        
        //1. crea el runnable
        Saludor s = new Saludor();
        
        //2. creo hilo
        Thread h1 = new Thread(s);
        
        //3. Inicio hilo
        h1.start();
        
        Thread h2 = new Thread(s);
        h2.start();
        
        System.out.println("FIN");
        
    }
}
