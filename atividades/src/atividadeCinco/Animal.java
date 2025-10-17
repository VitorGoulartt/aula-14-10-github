package atividadeCinco;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private double peso;
    private  int doisanos;

    public Animal(String nome, String especie, int idade, double peso){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;   
    }
    public int getdoisanos(){
        return doisanos;
    }
    public void setdoisanos(int doisanos){
        this.doisanos = doisanos;

    }
    public String getnome(){
        return nome;
    }
    public void setnome( String nome){
        this.nome = nome;

    }
    public String getespecie(){
        return especie;

    }
    public void setespecie(String especie){
        this.especie = especie;

    }
    public int getidade(){
        return idade;

    }
    public void setidade(int idade){
        this.idade = idade;
    }
    public double getpeso(){
        return peso;
    }
    public void setpeso (double peso){
        this.peso = peso;
    }
    public void calcularIdadeEmAnosHUmanos(){
        if (this.idade == 0){
            System.out.println("Erro numero 0 digitado");

        }else if(this.idade == 1){
            this.idade = 15;
        } else{
          this.doisanos = 24;
            doisanos += this.idade * 4;
            System.out.println("Seu cachorro tem " + this.idade + "em idade humana");

        }
        



    }
    public void atualizarPeso(double novoPeso){
        this.peso = novoPeso;

    }
    public void classificarPorte(){
        if(this.peso > 1 && this.peso <= 5){
            System.out.println("Porte: Miniatura");

        }else if(this.peso > 5 && this.peso <= 10){
            System.out.println("Porte: pequeno");
        }else if(this.peso > 10 && this.peso <= 25){
            System.out.println("Porte: medio");

        }else if(this.peso > 25 && this.peso <= 45){
            System.out.println("Porte: Grande");
        }else if(this.peso > 45){
            System.out.println("Porte: Gigante");

        }

    }
    

}
