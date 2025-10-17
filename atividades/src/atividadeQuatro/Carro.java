package carro;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double quilometragem;
    
    public Carro(String modelo, String marca, int ano, double quilometragem){

        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }
    public String getmodelo(){
        return modelo;
    }
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }


}
