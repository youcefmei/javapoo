package com.youcefmei.javapoo.encapsulation.exo3;

public class Livre {
    private String titre,auteur;
    private int nbPages;

    public Livre( ) {
    }

    public Livre( String unAuteur , String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    public Livre( String unAuteur , String unTitre, int nbPages) {
        auteur = unAuteur;
        titre = unTitre;
        setNbPages(nbPages);
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getTitre() {
        return titre;
    }


    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nb) {
        if (nb > 0){
            nbPages = nb;
        }
        else {
            System.out.println("Le nombre de page doit être supérieur à zéro ");
        }
    }

    public void afficheToi() {
        System.out.println("Le titre est : " + titre);
        System.out.println("L'auteur est : " + auteur);
        System.out.println("Le nombre de pages est : " + nbPages+ "\n");
    }



}
