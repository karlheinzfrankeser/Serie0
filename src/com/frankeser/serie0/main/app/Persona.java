package com.frankeser.serie0.main.app;

import java.util.Calendar;

public class Persona {
    private String nome;
    private String cognome;
    private int annoNascita;

    public Persona(String nome, String cognome, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public int getEta() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);;
        return currentYear - getAnnoNascita();
    }

    @Override
    public String toString() {
        return "La persona si chiama: " + getNome() + " " + getCognome() + " ed é nata nell'anno " + getAnnoNascita() + " e quindi ha " + getEta() + " anni.";
    }
}
