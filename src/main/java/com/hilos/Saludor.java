package com.hilos;

import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Saludor implements Runnable{

    @Override
    public void run() {
        //MUESTRA N VECES UN MENSAJE
        Logger logger = Logger.getLogger("Saludador");
        
        for (int i = 0; i < 20; i++) {
            //System.out.println("HOLA " + i);
            logger.info(Thread.currentThread().getName() + "- hola " + i);
        }
    }
    
    
    
}
