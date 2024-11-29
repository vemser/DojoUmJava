package sevicos;

import banco.ContaBancaria;

public class Financiamento {
    private double valorFinanciado;
    private double taxaJurosAnual ;
    private int prazoMeses; 
    private TipoFinanciamento tipoFinanciamento;
    private ContaBancaria contaBancaria;

    public  Financiamento (double valorFinanciado, double taxasJurosAnual, int prazoMeses, TipoFinanciamento tipoFinanciamento, ContaBancaria contaBancaria){
        this.valorFinanciado = valorFinanciado;
        this.taxasJurosAnual = taxaJurosAnual;
        this.prazoMeses = prazoMeses;
        this.tipoFinanciamento = tipoFinanciamento; 
        this.contaBancaria = contaBancaria; 
    }

    public double getValorFinanciado() {
        return valorFinanciado;
    }

    public void setValorFinanciado(double valorFinanciado) {
        this.valorFinanciado = valorFinanciado;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }

    public TipoFinanciamento getTipoFinanciamento() {
        return tipoFinanciamento;
    }

    public void setTipoFinanciamento(TipoFinanciamento tipoFinanciamento) {
        this.tipoFinanciamento = tipoFinanciamento;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }


    
}
