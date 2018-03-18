package com.nico.magasin.models.entite;

import com.nico.magasin.models.instru.Instrument;

import java.util.ArrayList;

public class Inst_owner {
    protected int id;
    protected String nom,prenom;
    protected ArrayList<Instrument> liste_instru;

    public Inst_owner(){}

    // ajouter ou supprimer un instrument a la liste
    public void ajouter(Instrument i){

    };

    public void supprimer(Instrument i){

    };


    /// setters
    public void setId(int id){
        this.id=id;
    }

    public void setListe_instru(ArrayList<Instrument> liste_instru){
        this.liste_instru=liste_instru;
    }


    /// getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ArrayList<Instrument> getListe_instru() {
        return liste_instru;
    }
}
