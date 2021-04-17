/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artiste;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

/**
 *
 * @author Anas FAOUR
 */
public class Startup {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        Artiste duchamp = new Artiste("Marcel Duchamp");
        Artiste picasso = new Artiste("Pablo Picasso");
        
        Work fontaine = new Work("Fontaine","Sculpture",1917,duchamp);
        Work roueDeBicyclette  = new Work("Roue de bicyclette","Sculpture",1913,duchamp);
        Work guernica  = new Work("Guernica","Sculpture",1937,picasso);
        
        
        Catalogue catalogue = new Catalogue();
        
        catalogue.addWork(fontaine);
        catalogue.addWork(roueDeBicyclette);
        catalogue.addWork(guernica);
        
        System.out.println(catalogue);
        
        
    }
}
