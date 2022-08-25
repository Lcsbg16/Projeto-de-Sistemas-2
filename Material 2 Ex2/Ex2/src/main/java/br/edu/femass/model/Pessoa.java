package br.edu.femass.model;

public abstract class Pessoa {
    protected String nome;
    protected Double rendaBruta;

    public Pessoa(String nome, Double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public Double getRendaBruta() {
        return rendaBruta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRendaBruta(Double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract Double CalcularIR();
}
