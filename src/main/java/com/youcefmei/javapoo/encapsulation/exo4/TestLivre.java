package com.youcefmei.javapoo.encapsulation.exo4;


public class TestLivre {
    public static void main(String[] args) {
        Livre livre1 = new Livre("auteur1","titre 1",300,45.366f);
        Livre livre2 = new Livre("auteur2","titre 2",300,52.5669f);
        Livre livre3 = new Livre("auteur3","titre 3",300,20.38744f);

        livre1.afficheToi();
        livre2.afficheToi();
        livre3.afficheToi();

        livre1.setPrix(123.233f);
        livre2.setPrix(425.233f);


    }
}
