package atividadeUm;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	
		Livro livro1 = new Livro("moranguinho", "Machado Carvalho", 1998, 80);
		
		livro1.biblioteca();
		livro1.settitulo(sc.nextLine());
	    livro1.gettitulo();
	    
	    livro1.paginas();
	    livro1.setquantidadePaginas(sc.nextInt());
	    livro1.getquantidadePaginas();
		
		
		
		livro1.calcularTempoLeitura();
		livro1.exibirInformaçoes();
		sc.close();
	}
	
}
