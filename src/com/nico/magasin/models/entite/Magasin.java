package com.nico.magasin.models.entite;

import com.nico.magasin.models.instru.Instrument;

import java.util.ArrayList;

public class Magasin extends Inst_owner {

    Magasin(){
        super();
        this.nom="MAGASIN";
        this.id=1;/// forcer l'ID du magasin à 1 dans la BDD
        /// le MAGASIN doit etre la premiere entité créée dans la BDD
        this.liste_instru=new ArrayList<Instrument>();
    }


    public void setStock(ArrayList<Instrument> list_instruments){
        super.setListe_instru(list_instruments);
    }

    @Override
    public void ajouter(Instrument i) {
        this.liste_instru.add(i);
    }

    @Override
    public void supprimer(Instrument i) {
        this.liste_instru.remove(i);
    }
}
