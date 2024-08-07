package com.youcefmei.javapoo.encapsulation.exo3;


public class TestLivre {
    public static void main(String[] args) {
        Livre livre1 = new Livre("auteur1","titre 1",300);
        Livre livre2 = new Livre("auteur2","titre 2",300);
        Livre livre3 = new Livre("auteur3","titre 3",300);

        livre1.afficheToi();
        livre2.afficheToi();
        livre3.afficheToi();


    }
}
