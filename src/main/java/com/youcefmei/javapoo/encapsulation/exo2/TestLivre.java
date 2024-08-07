package com.youcefmei.javapoo.encapsulation.exo2;


public class TestLivre {
    public static void main(String[] args) {
        Livre livre1 = new Livre("mr","titre mr");
        livre1.setNbPages(200);


        Livre livre2 = new Livre("mme","titre mme");
        livre2.setNbPages(100);



        System.out.println("L'auteur de ce livre est : " + livre1.getAuteur());
        System.out.println("Le nombre de page ce livre est : " + livre1.getNbPages());

        System.out.println("L'auteur de ce livre est : " + livre2.getAuteur());
        System.out.println("Le nombre de page ce livre est : " + livre2.getNbPages());



    }
}
