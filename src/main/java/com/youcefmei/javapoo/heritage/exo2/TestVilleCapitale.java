package com.youcefmei.javapoo.heritage.exo2;

public class TestVilleCapitale {
    public static void main(String[] args) {
        Ville v1 = new Ville("Lyon",1_500_000);
        Ville v2 = new Ville("Bobigny");

        Capitale c1 = new Capitale("Paris","France",10_000_000);
        Capitale c2 = new Capitale("Ouagadougou","Burkina-Faso");

        v1.afficheToi();
        v2.afficheToi();
        c1.afficheToi();
        c2.afficheToi();

    }
}
