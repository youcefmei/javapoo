package com.youcefmei.javapoo.exo1;

public class TestCompte {
    public static void main(String[] args) {
        Compte compte = new Compte(1000d);
        compte.afficher();
        compte.retirer(100d);
        compte.afficher();
        compte.deposer(200d);
        compte.afficher();
    }
}
