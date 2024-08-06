package com.youcefmei.javapoo.exo1;

public class Compte {

    private Double solde;

    public Compte(Double solde) {
        this.setSolde(solde);
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }


    public void deposer(double montant){
        if (montant<=0){
            System.out.println("Veuillez déposer une somme supérieur à zéro");
        }
        else{
            this.setSolde( this.solde + montant);
        }
    }

    public void retirer(double montant){
        if (montant<=0){
            System.out.println("Veuillez retirer une somme supérieur à zéro");
        }
        else{
            this.setSolde( this.solde - montant );
        }
    }

    public void afficher(){
        System.out.println("Le solde du compte est : " + this.getSolde() + "\n");
    }


}



