package com.youcefmei.javapoo.encapsulation.exo4;

public class Livre {
    private String titre,auteur;
    private int nbPages;

    private float prix;
    private boolean prixFixe;

    public Livre( ) {
    }

    public Livre( String unAuteur , String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
    }

    public Livre( String unAuteur , String unTitre, int nbPages) {
        auteur = unAuteur;
        titre = unTitre;
        setNbPages(nbPages);
    }

    public Livre( String unAuteur , String unTitre, int nbPages, float prix) {
        auteur = unAuteur;
        titre = unTitre;
        setNbPages(nbPages);
        setPrix(prix);
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if ( ( prix > 0 )  && ( prixFixe == false ) ){
            this.prix = Math.round(prix*100)/100.0f;
            prixFixe = true;
        } else if (prixFixe) {
            System.out.println("Le prix à déjà été fixé");
        } else{
            System.out.println("Le prix doit être supérieur à zéro");
        }
    }


    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getTitre() {
        return titre;
    }


    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nb) {
        if (nb > 0){
            nbPages = nb;
        }
        else {
            System.out.println("Le nombre de page doit être supérieur à zéro ");
        }
    }

    public void afficheToi() {
        if ( (titre != null) && (!titre.isEmpty() ) && ( !!titre.isBlank()))  {
            System.out.println("Le titre est : " + titre);
        }else{
            System.out.println("Le titre du livre n'est pas encore définit");
        }
        if ( (auteur != null) && (!auteur.isEmpty() ) && ( !!auteur.isBlank()))  {
            System.out.println("L'auteur est : " + auteur);
        }else{
            System.out.println("L'auteur du livre n'est pas encore définit");
        }


        System.out.println("Le nombre de pages est : " + nbPages+ "\n");
        System.out.println("Le prix est de : " + prix + "\n");
    }



}
