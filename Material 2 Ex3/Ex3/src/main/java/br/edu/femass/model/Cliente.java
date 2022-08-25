package br.edu.femass.model;

public class Cliente implements DAO {
    private int codigo;
    private String nome;

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public void inserir() {
        System.out.println("Inserindo...");
    }
    public void excluir() {
        System.out.println("Excluindo...");
    }
    public void localizar() {
        System.out.println("Localizando...");
    }
}
