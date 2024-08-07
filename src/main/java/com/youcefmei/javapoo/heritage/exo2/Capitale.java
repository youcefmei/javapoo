package com.youcefmei.javapoo.heritage.exo2;

public class Capitale extends Ville {
    private String pays;

    public Capitale(String nom, String pays) {
        super(nom);
        this.pays = pays;
    }

    public Capitale(String nom,  String pays , int nbHab) {
        super(nom, nbHab);
        this.pays = pays;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public void afficheToi() {
        System.out.print("Ville : " + getNom());
        if (getNbHab() < 0 ){
            System.out.print(" nombre d'habitants inconnu" );
        }else{
            System.out.print(" nombre d'habitants " + getNbHab());
        }
        System.out.println(" Capitale de " + getPays());

    }
}
