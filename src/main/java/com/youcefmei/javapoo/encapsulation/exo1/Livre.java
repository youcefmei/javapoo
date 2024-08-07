package com.youcefmei.javapoo.encapsulation.exo1;

public class Livre {


    private String titre,auteur;
    private int nbPages;

    public Livre( String unAuteur , String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setNbPages(int nb) {
        nbPages = nb;
    }
}
