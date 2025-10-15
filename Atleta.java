public class Atleta {
    private String nome;
    private String modalidade;
    private int idade;
    private double pesokg;
    private double alturaMetros;

    public Atleta(String nome, String modalidade, int idade, double pesokg, double alturaMetros){
        this.nome = nome;
        this.modalidade = modalidade;
        this.idade = idade;
        this.pesokg = pesokg;
        this.alturaMetros = alturaMetros;
    }
    public String getnome(){
        return nome;
    }
    public String getmodalidade(){
        return modalidade;
    }
    public int getidade(){
        return idade;
    }
    public double getpesokg(){
        return pesokg;
    }
    public double getalturaMetros(){
        return alturaMetros;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setmodalidade(String modalidade){
        this.modalidade = modalidade;
    }
    public void setidade(int idade){
        this.idade = idade;
    }
    public void setpesokg(double pesokg){
        this.pesokg = pesokg;
    }
    public void setalturaMetros(double alturaMetros){
        this.alturaMetros = alturaMetros;
    }
    public void calcularIMC(){

        
    }


}
