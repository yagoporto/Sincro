package com.sincro.ui;

import org.fusesource.jansi.Ansi;
import static org.fusesource.jansi.Ansi.ansi;

import java.util.List;

public class Cartas {
    private String naipe;
    private String valor;
    private String simbolo;

    public Cartas(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
        this.simbolo = definirSimbolo(naipe);

    }
    
    private String definirSimbolo(String naipe){
        return switch (naipe) {
            case "♠" -> ansi().fg(Ansi.Color.GREEN).a(naipe).reset().toString();
            case "♥" -> ansi().fg(Ansi.Color.RED).a(naipe).reset().toString();
            case "♦" -> ansi().fg(Ansi.Color.RED).a(naipe).reset().toString();
            case "♣" -> ansi().fg(Ansi.Color.GREEN).a(naipe).reset().toString();
            default -> "";
        };     
    }


    public void exibirCarta(){
        Ansi.Color cor = switch (naipe) {
            case "♠", "♣" -> Ansi.Color.GREEN;
            case "♥", "♦" -> Ansi.Color.RED;
            default -> Ansi.Color.DEFAULT;
        };

        String vazio = "";
        String valorEsquerda = String.format("%-3s", valor); // Alinha à esquerda
        String valorDireita = String.format("%1s", vazio);   // Alinha à direita
    


        System.out.println(ansi().eraseScreen());
        System.out.println(ansi().fg(cor).a("┌──────────┐"));
        System.out.println(ansi().fg(cor).a("│ ").a(simbolo).fg(cor).a("        │"));
        System.out.println(ansi().fg(cor).a("│          │"));
        System.out.println(ansi().fg(cor).a("│    ").a(valorEsquerda + valorDireita).a("  │"));
        System.out.println(ansi().fg(cor).a("│          │"));
        System.out.println(ansi().fg(cor).a("│        ").a(simbolo).fg(cor).a(" │"));
        System.out.println(ansi().fg(cor).a("└──────────┘"));
    }
}
