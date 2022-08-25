package br.edu.femass.model;

public class PessoaJuridica extends Pessoa {
    private int CNPJ;

    public PessoaJuridica(String nome, Double rendaBruta, int CNPJ) {
        super(nome, rendaBruta);
        this.CNPJ = CNPJ;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Double CalcularIR(){
        if(this.rendaBruta<=30000)
            return 0.0;

        if(this.rendaBruta>30000 && this.rendaBruta<=50000)
            return this.rendaBruta*0.1;

        if(this.rendaBruta>50000 && this.rendaBruta <90001)
            return this.rendaBruta*0.2;

        return this.rendaBruta*0.27;
    }
}

