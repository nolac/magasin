package com.nico.magasin.models.instru;

import com.nico.magasin.models.instru.Entretien;

import java.util.ArrayList;

public class Instrument {
    private int id;
    private String def,marque,obs;
    private ArrayList<Entretien> instr_entretien;

    public Instrument(String def,String marque){
        this.def=def;
        this.marque=marque;
        this.instr_entretien = new ArrayList<Entretien>();
        this.obs=new String();
    }

    public void addEntretien(Entretien e){
        this.instr_entretien.add(e);
    }// ajouter un entretien a l'instrument

    // setters
    public void setObs(String obs){
        this.obs+=("\n" + obs);
    }

    public void setId(int id){
        this.id=id;
    }

    public void setInstr_entretien(ArrayList<Entretien> e){
        this.instr_entretien=e;
    }



    // getters
    public String getDef(){
        return this.def;
    }

    public String getMarque() {
        return marque;
    }

    public String getObs() {
        return obs;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Entretien> getInstr_entretien() {
        return instr_entretien;
    }
}
