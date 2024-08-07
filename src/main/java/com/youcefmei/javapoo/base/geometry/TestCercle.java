package com.youcefmei.javapoo.base.geometry;

public class TestCercle {
    public static void main(String[] args) {
        Point centre = new Point(0,0);
        Point point = new Point(0,0);

        Cercle cercle = new Cercle(5,centre);

        cercle.afficher();
        cercle.testAppartenance(point);

    }

}
