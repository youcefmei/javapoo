package com.youcefmei.javapoo.base.geometry;

public class Cercle {

    private Point centre;
    private double rayon;

    public Cercle(double rayon, Point centre) {
        this.rayon = rayon;
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double perimetre(){
        return 2*Math.PI*rayon;
    }

    public double surface(){
        return Math.PI*rayon*rayon;
    }

    public void testAppartenance(Point point){
        double dx = Math.abs( point.getAbscisse() - centre.getAbscisse());
        double dy = Math.abs( point.getOrdonnee() - centre.getOrdonnee());

        double hypothenuse = Math.sqrt(dx*dx+dy*dy);
        System.out.println("L'hypothenuse est de : " + hypothenuse);
        if (hypothenuse == rayon){
            System.out.println("Le point appartient au cercle");
        }
        else{
            System.out.println("Le point n'appartient pas au cercle");
        }
    }

    public void afficher(){
        System.out.println("Le perimetre du cercle est de : " + this.perimetre());
        System.out.println("La surface du cercle est de : " + this.surface());
    }


}
