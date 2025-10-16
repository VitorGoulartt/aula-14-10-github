package atividadeDois;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int cliente;
		String nome = "";
		String codigo= "";
		int quantidade = 0;
		double preço = 0;
		boolean desligar = true;
		Menu menu1 = new Menu();
		Produto produto1 = new Produto(nome, codigo, quantidade, preço);
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("-------------- BEM VINDO -------------");
        do{
         menu1.mostrar();
         cliente = teclado.nextInt();
         switch(cliente){
             case 1:
                 produto1.produtoAdicionar();
                 
                 if( produto1.getnome().equals(nome) || produto1.getcodigo().equals(codigo) ){
                     System.out.println(" Informaçoes colocada invalidas");
                     
                    }else{
                        System.out.println("Produto Adicionado");
                    }
                 continue;
                 
             
             case 2:
                 
                 produto1.adicionarEstoque(quantidade);
                 System.out.println("Estoque: " + produto1.getquantidade());
                 break;
             case 3:
                 produto1.removerEstoque(1);
                 System.out.println("Estoque: " + produto1.getquantidade());
                 break;
             case 4:
                 produto1.info();
                 break;
                 
             case 5:
                 System.out.println("Encerrando sistema");
                 desligar = false;
                 break;
             default:
             System.out.println("Opçao invalida");
             break;
              
            } 		        
         		                                                         
         		        
          		             
            		    
            		    
      	 }while( desligar);
		
		teclado.close();
		teclado2.close();
		

    }
}
