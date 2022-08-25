package br.edu.femass.model;

public class Robo implements  Controle{
    @Override
    public void andar() {
        System.out.println("Andando...");
    }
    public void virar() {
        System.out.println("Virando...");
    }
    public void falar() {
        System.out.println("Falando...");
    }
}