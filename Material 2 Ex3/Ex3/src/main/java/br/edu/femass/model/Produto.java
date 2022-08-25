package br.edu.femass.model;

public class Produto implements DAO {
    private int numero;
    private String descricao;

    public Produto(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public void inserir() {
        System.out.println("Inserindo...");
    }
    public void excluir() {
        System.out.println("Excluindo...");
    }
    public void localizar() {
        System.out.println("Localizando...");
    }

    public void baixar(){
        System.out.println("Baixando...");
    }

}
