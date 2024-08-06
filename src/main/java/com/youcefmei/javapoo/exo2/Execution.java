package com.youcefmei.javapoo.exo2;

public class Execution {

    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        voiture.afficher();
        voiture.setMarque("Toyota");
        voiture.afficher();
        voiture.setPrix(30_000d);
        voiture.afficher();


    }


}
