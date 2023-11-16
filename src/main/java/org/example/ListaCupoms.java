package org.example;

public enum ListaCupoms {
    CINCO(0.05),
    DEZ(0.10),
    VINTE(0.20),
    TRINTA(0.30),
    QUARENTA(0.40),
    CINQUENTA(0.50);
    private double percentualDesconto;


    ListaCupoms(double valorPercentual) {
        this.percentualDesconto = valorPercentual;
    }
    public double getPercentualDesconto(){
        return percentualDesconto;
    }
}
