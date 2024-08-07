package com.youcefmei.javapoo.base.exo3;

public class Rectangle {

    private Double longueur;
    private Double largeur;

    public Rectangle(Double longueur, Double largeur) {
        this.setLongueur(longueur);
        this.setLargeur(largeur);
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        if ( largeur <=0 ) {
            throw new IllegalArgumentException("la largeur doit être supérieur 0");
        }
        else{
            this.largeur = largeur;
        }
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        if ( longueur <=0 ) {
            throw new IllegalArgumentException("la longueur doit être supérieur 0");
        }
        else{
            this.longueur = longueur ;
        }
    }

    public Double surface(){
        return this.longueur * this.largeur;
    }

    public Double perimetre(){
        return 2 * ( this.longueur + this.largeur );
    }

    public void afficher(){
        System.out.println("Longueur: " + this.longueur);
        System.out.println("Largeur: " + this.largeur);
        System.out.println("Surface: " + this.surface());
        System.out.println("Perimetre: " + this.perimetre() );
        System.out.println();
    }




}
