package br.edu.femass.model;

public class PessoaFisica extends Pessoa {
    private int RG;

    public PessoaFisica(String nome, Double rendaBruta, int RG) {
        super(nome, rendaBruta);
        this.RG = RG;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public Double CalcularIR(){
        if(this.rendaBruta<=1500)
            return 0.0;

        if(this.rendaBruta>1500 && this.rendaBruta<=3000)
            return this.rendaBruta*0.1;

        if(this.rendaBruta>3000 && this.rendaBruta <10001)
            return this.rendaBruta*0.2;

        return this.rendaBruta*0.27;
    }
}