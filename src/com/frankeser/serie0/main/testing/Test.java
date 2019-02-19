package com.frankeser.serie0.main.testing;

import com.frankeser.serie0.main.app.Corso;
import com.frankeser.serie0.main.app.Palestra;
import com.frankeser.serie0.main.app.Persona;
import com.frankeser.serie0.main.app.util.Weekdays;

public class Test {
    public static void main(String[] args) {
        Palestra lidoLocarno = new Palestra("Lido Locarno");
        Persona mikeTrainer = new Persona("Mike", "Trainer", 1979);
        Persona karl = new Persona("Karl", "Heinz", 2000);
        Corso crossFit = new Corso("CrossFit", mikeTrainer, Weekdays.MARTEDI);
        lidoLocarno.aggiungiCorso(crossFit);
        lidoLocarno.aggiugniIscritti(mikeTrainer);
        crossFit.aggiungiIscritto(mikeTrainer);
        crossFit.aggiungiIscritto(karl);
        System.out.println(crossFit.toString());
        System.out.println(mikeTrainer.toString());
    }
}
