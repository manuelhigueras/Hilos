/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Saludador2 implements Runnable{
    private int indice = 0;
    Logger logger = Logger.getLogger("Saludador");

    @Override
    public void run() {
        while(indice < 20){
            try {
                logger.info(Thread.currentThread().getName() + "- hola " + indice);
                indice++;
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Saludador2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }
    
    /**
     *     private int indice = 0;
    private AtomicInteger i = new AtomicInteger(0);
    Logger logger = Logger.getLogger("Saludador");

    @Override
    public void run() {
        while(i.get() < 20){
            logger.info(Thread.currentThread().getName() + "- hola " + i);
            //indice++;
            i.addAndGet(1);
        }    
    }
     */
}
