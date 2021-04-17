/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.core.entity;

import com.directmedia.onlinestore.core.entity.Artiste;

/**
 *
 * @author Anas FAOUR
 */
public class Work {
    private String title;
    private String genre;
    private int release;
    private Artiste mainArtiste;

    public Work() {
    }

    public Work(String title, String genre, int release, Artiste mainArtiste) {
        this.title = title;
        this.genre = genre;
           if(release <=+9999 && release >=-9999){
            this.release = release;
        }else{
            this.release = 1970;
        }
        this.mainArtiste = mainArtiste;
    }
    
    

    public Artiste getMainArtiste() {
        return mainArtiste;
    }

    public void setMainArtiste(Artiste mainArtiste) {
        this.mainArtiste = mainArtiste;
    }

    /**
     * Get the value of release
     *
     * @return the value of release
     */
    public int getRelease() {
        return release;
    }

    /**
     * Set the value of release
     *
     * @param release new value of release
     */
    public void setRelease(int release) {  
            this.release = release;   
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", title, release);
    }

    
}
