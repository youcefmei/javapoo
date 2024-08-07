package com.youcefmei.javapoo.encapsulation.exo1;


import com.youcefmei.javapoo.encapsulation.exo2.Livre;

public class TestLivre {
    public static void main(String[] args) {
        Livre livre1 = new Livre("mr","titre mr");
        Livre livre2 = new Livre("mme","titre mme");

        System.out.println("L'auteur de ce livre est : " + livre1.getAuteur());
        System.out.println("L'auteur de ce livre est : " + livre2.getAuteur());


    }
}
