package br.edu.femass.model;

public class main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente(185,"Joao");
        c1.inserir();
        c1.excluir();
        c1.localizar();


        Fornecedor f1 = new Fornecedor("2254136","NSEI");
        f1.inserir();
        f1.inserir();

        Produto p1 = new Produto(1,"Belle Belinha");
        p1.inserir();
        p1.excluir();
        p1.localizar();
        p1.baixar();
    }
}
