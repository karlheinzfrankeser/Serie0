package com.frankeser.serie0.main.app;

import java.util.ArrayList;
import java.util.List;

public class Palestra {
    private String nome;
    private List<Corso> corsi;
    private List<Persona> iscritti;

    public Palestra(String nome) {
        this.nome = nome;
        this.corsi = new ArrayList<>();
        this.iscritti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Corso> getCorsi() {
        return corsi;
    }

    public List<Persona> getIscritti() {
        return iscritti;
    }

    public boolean aggiungiCorso(Corso corso) {
        return this.corsi.add(corso);
    }

    public boolean aggiugniIscritti(Persona persona) {
        return this.iscritti.add(persona);
    }

}
