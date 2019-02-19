package com.frankeser.serie0.main.app;

import com.frankeser.serie0.main.app.util.Weekdays;

import java.util.ArrayList;
import java.util.List;

public class Corso {
    private String nome;
    private Persona istruttore;
    private Weekdays giornoSettimana;
    private List<Persona> iscritti;

    public Corso(String nome, Persona istruttore, Weekdays giornoSettimana) {
        this.nome = nome;
        this.istruttore = istruttore;
        this.giornoSettimana = giornoSettimana;
        this.iscritti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Persona getIstruttore() {
        return istruttore;
    }

    public Weekdays getGiornoSettimana() {
        return giornoSettimana;
    }

    public List<Persona> getIscritti() {
        return iscritti;
    }

    public boolean aggiungiIscritto(Persona persona) {
        return this.iscritti.add(persona);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Persona p : this.iscritti) {
            stringBuilder.append(p.getNome() + " " + p.getCognome() + ", ");
        }
        String iscrittiList = stringBuilder.toString();

        iscrittiList = iscrittiList.substring(0, iscrittiList.length() - 2);

        return String.format("Informazioni del corso %s: Istruttore: %s, giorno settimanale %s, lista di tutti gli iscritti: [%s]", this.nome, this.istruttore.getNome(), this.giornoSettimana.toString(), iscrittiList);
    }
}
