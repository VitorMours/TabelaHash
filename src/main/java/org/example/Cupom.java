package org.example;

public class Cupom {
    private int idCupom;
    private boolean usoCupom;
    public String nomeCupom;


    public String getNomeCupom(){
        return this.nomeCupom;
    }

    public boolean getUsoCupom(){
        return this.usoCupom;
    }

    public void setUsoCupom(){
        this.usoCupom = true;
    }


    public boolean validarCupom(Cupom cupom){
        return true;
    }


}
