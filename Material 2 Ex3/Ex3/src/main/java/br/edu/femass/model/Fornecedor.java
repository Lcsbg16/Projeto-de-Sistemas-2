package br.edu.femass.model;

public class Fornecedor implements DAO {
    private String CNPJ;
    private String RazaoSocial;

    public Fornecedor(String CNPJ, String razaoSocial) {
        this.CNPJ = CNPJ;
        RazaoSocial = razaoSocial;
    }

    public void inserir() {
        System.out.println("Inserindo...");
    }
    public void excluir() { System.out.println("Excluindo...");
    }
    public void localizar() {
        System.out.println("Localizando...");
    }
}
