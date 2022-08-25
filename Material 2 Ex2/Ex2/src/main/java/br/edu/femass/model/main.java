package br.edu.femass.model;

public class main {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("Lucas",1800.00,1874572);
        System.out.println(pf1.getNome());
        System.out.println(pf1.CalcularIR());
        pf1.setRG(22222);
        System.out.println(pf1.getRG());


        PessoaJuridica pj1 = new PessoaJuridica("AAAAAA",1500000.00,25488);
        System.out.println(pj1.CalcularIR());
        pj1.setNome("BBB");
        System.out.println(pj1.getNome());
    }
}
