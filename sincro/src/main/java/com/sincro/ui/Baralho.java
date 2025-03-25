package com.sincro.ui;

import org.fusesource.jansi.Ansi;
import static org.fusesource.jansi.Ansi.ansi;

import com.sincro.ui.Cartas;
import java.util.List;
import java.util.ArrayList;


public class Baralho {
    private List<Cartas> cartas;

    public Baralho(){
        List<Cartas> cartas = new ArrayList<>();
        String[] naipes = {"♠", "♥", "♦", "♣"};
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    
        for (String naipe : naipes) {
            for (String valor : valores) {
                cartas.add(new Cartas(naipe, valor));
            }    
        }
    }
}    