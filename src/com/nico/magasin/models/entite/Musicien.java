package com.nico.magasin.models.entite;

import com.nico.magasin.models.instru.Instrument;

import java.util.ArrayList;

public class Musicien extends Inst_owner {

    Musicien(String nom,String prenom){
        this.nom=nom;
        this.prenom=nom;
        this.liste_instru=new ArrayList<Instrument>();
    }

    /// setters
    public void setNom(String nom){

    }

    public void setPrenom(String prenom){

    }
}
