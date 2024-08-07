package com.youcefmei.javapoo.base.exo4.geometry;

public class TestCercle {
    public static void main(String[] args) {
        Point centre = new Point(1,-1);

        Point point1 = new Point(6,-1);
        Point point2 = new Point(8,2);

        Cercle cercle = new Cercle(5,centre);

        cercle.afficher();
        cercle.testAppartenance(point1);

        cercle.testAppartenance(point2);

    }

}
