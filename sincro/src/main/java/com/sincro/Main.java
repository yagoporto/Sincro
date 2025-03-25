package com.sincro;
import com.sincro.ui.Baralho;
import com.sincro.ui.Cartas;

public class Main {
    public static void main(String[] args) {
        // Ativa o suporte a cores no Windows
        org.fusesource.jansi.AnsiConsole.systemInstall();


        Cartas carta = new Cartas("♠", "10");
        carta.exibirCarta();
    }
}