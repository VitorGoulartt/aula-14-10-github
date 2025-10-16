package atividadeUm;
import java.util.Scanner;
public class Livro{
    Scanner sc = new Scanner(System.in);
 private String titulo;
 private String autor;
 private int anoPublicaçao;
 private int quantidadePaginas;


 

public Livro(String titulo, String autor, int anoPublicaçao, int quantidadePaginas){

    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicaçao = anoPublicaçao;
    this.quantidadePaginas = quantidadePaginas;

}
public String gettitulo(){

    return titulo;
}
public String getautor(){

    return autor;

}
public int getanoPublicaçao(){

    return anoPublicaçao;
}
public int getquantidadePaginas(){

    return quantidadePaginas;
}
public void settitulo (String titulo1 ){

    this.titulo = titulo1;
}
public void setautor(String autor){

    this.autor = autor;
}
public void setanoPublicaçao(int anoPublicaçao){

    this.anoPublicaçao = anoPublicaçao;
}
public void setquantidadePaginas(int quantidadePaginas){
    if(quantidadePaginas != 0 ){
         this.quantidadePaginas = quantidadePaginas;
    }else{
        System.out.println("Numero de paginas invalidos");
    }

   
}
public void biblioteca(){
    System.out.println("--- BEM VINDO ---");
   System.out.println("Qual e o nome do seu livro?" );
   
}
public void paginas(){
    System.out.println("Quantas paginas tem?");
    
}
public float calcularTempoLeitura(){
    float qualquer = (float)quantidadePaginas;
    float quantidadeHoras = qualquer / 60;
    return quantidadeHoras;


    // //if( this.quantidadePaginas <=  60 ){
        
        
    //     System.out.println("O tempo para ler esse livro e de: " + quantidadePaginas +" minutos" );
        
    // }else if(this.quantidadePaginas > 60){
        
    //     System.out.println("O tempo para ler esse livro e de: " );
    //     System.out.printf(" horas %.1f\n", quantidadePaginas);
        
    // }

}
public void exibirInformaçoes(){

 System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAno: " + anoPublicaçao + "\nTotal de paginas: " + quantidadePaginas  + "\ntempo de leitura: " + calcularTempoLeitura()+" horas");
}

}

