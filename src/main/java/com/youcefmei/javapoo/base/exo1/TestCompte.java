package com.youcefmei.javapoo.base.exo1;

public class TestCompte {
    public static void main(String[] args) {
        Compte compte = new Compte(1_000d);
        compte.afficher();
        compte.deposer(200d);
        compte.afficher();
        compte.retirer(100d);
        compte.afficher();
    }
}
