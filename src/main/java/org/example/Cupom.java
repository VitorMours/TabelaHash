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

#Teste_esse_daqui


package org.example;

public class Cupom {
    private int idCupom;
    private EstadoCupom estadoCupom;
    public String nomeCupom;

    public enum EstadoCupom {
        DISPONIVEL,
        USADO
    }

    public Cupom(int idCupom, String nomeCupom) {
        this.idCupom = idCupom;
        this.nomeCupom = nomeCupom;
        this.estadoCupom = EstadoCupom.DISPONIVEL; 
    }

    public String getNomeCupom() {
        return this.nomeCupom;
    }

    public EstadoCupom getEstadoCupom() {
        return this.estadoCupom;
    }

    public void setEstadoCupom(EstadoCupom estado) {
        this.estadoCupom = estado;
    }

    public boolean validarCupom() {
        return this.estadoCupom == EstadoCupom.DISPONIVEL;
    }

    public void usarCupom() {
        if (validarCupom()) {
            this.estadoCupom = EstadoCupom.USADO;
        } else {
            System.out.println("O cupom não está disponível para uso.");
        }
    }
}


