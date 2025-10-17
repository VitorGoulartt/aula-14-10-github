package atividadeQuatro;


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
    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }
    public int getano(){
        return ano;
    }
    public void setano(int ano){
        this.ano = ano;
    }
    public double getquilometragem(double quilometragem){
        return quilometragem;
    }
    public void setquilometragem(double quilometragem){
        this.quilometragem = quilometragem;

    }
    public void calcularIdadeVeuiculo(){
        int idade = this.ano - 2025;
        System.out.println("A idade do veiculo e : " + idade + " anos");



    }
    public void atualizarQuilometragem(double novaQuilometragem){
        this.quilometragem = novaQuilometragem;


    }
    public void exibirInformarçoes(){
         System.out.println("Modelo: " + this.modelo);
         System.out.println("Marca: "+ this.marca);
         System.out.println("Ano: " + this.ano);
         System.out.println("Quilometragem atual: " + quilometragem);

    }


}
