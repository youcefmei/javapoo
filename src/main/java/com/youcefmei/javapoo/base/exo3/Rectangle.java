package com.youcefmei.javapoo.base.exo3;

public class Rectangle {

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.setLongueur(longueur);
        this.setLargeur(largeur);
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if ( largeur <=0 ) {
            throw new IllegalArgumentException("la largeur doit être supérieur 0");
        }
        else{
            this.largeur = largeur;
        }
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if ( longueur <=0 ) {
            throw new IllegalArgumentException("la longueur doit être supérieur 0");
        }
        else{
            this.longueur = longueur ;
        }
    }

    public double surface(){
        return this.longueur * this.largeur;
    }

    public double perimetre(){
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
