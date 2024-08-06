package com.youcefmei.javapoo.exo2;

public class Voiture {
    private String marque;
    private Double prix;

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        if (prix <= 0){
            System.out.println("Le prix n'est pas valide");
        }
        else{
            this.prix = prix;
        }
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        if ( (this.marque == null ) || ( (this.marque.isEmpty()) || ( this.marque.isBlank() ) )) {
            System.out.println("Cette marque n'est pas valide");
        }else{
            this.marque = marque;
        }
    }

    public void afficher(){
        if ( (this.marque == null) || (this.marque.isEmpty()) || (this.marque.isBlank()) ) {
            System.out.println("Le véhicule n'a pas de marque");
        }
        else{
            System.out.println("La marque du véhicule est: " + this.marque);
        }

        if ( this.prix == null ) {
            System.out.println("Le véhicule n'a pas de prix");
        }
        else{
            System.out.println("Le prix du véhicule est: " + this.prix);
        }
        System.out.println();
    }

}
