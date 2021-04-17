/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;
import com.directmedia.onlinestore.core.entity.Work;

/**
 *
 * @author Anas FAOUR
 */
public class Catalogue {

    private static HashSet<Work> listOfWorks = new HashSet<>();

    public Catalogue() {
    }

    public static HashSet<Work> getListOfWorks() {
        return listOfWorks;
    }

    public static void setListOfWorks(HashSet<Work> listOfWorks) {
        Catalogue.listOfWorks = listOfWorks;
    }

    public Catalogue addWork(Work work) {

        this.getListOfWorks().add(work);
        return this;
    }

    @Override
    public String toString() {
        return String.format(" Liste d’œuvres %s", Catalogue.getListOfWorks());
    }
    
    

}
