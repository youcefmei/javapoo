package com.youcefmei.javapoo.heritage.exo2;

public class Ville {

    private String nom;
    private int nbHab;


    public Ville(String nom) {
        this.nom = nom;
        this.nbHab = -1;
    }

    public Ville(String nom, int nbHab) {
        this.nom = nom;
        setNbHab(nbHab);
    }

    public String getNom() {
        return nom;
    }

    public int getNbHab() {
        return nbHab;
    }

    public void setNbHab(int nbHab) {
        if (nbHab < 0){
            System.out.println("Un nombre d'habitant doit être positif. La modification n'a pas été prise en compte");
        }else{
            this.nbHab = nbHab;
        }

    }

    public void afficheToi(){
        System.out.print("Ville : " + nom);
        if (nbHab < 0 ){
            System.out.println(" nombre d'habitants inconnu" );
        }else{
            System.out.println(" nombre d'habitants " + nbHab);
        }

    }


}
