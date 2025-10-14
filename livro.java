import java.util.Scanner;
public class livro {
    	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int nota;
		do{
		    System.out.println("Qual foi a nota do aluno?");
		    nota = teclado.nextInt();
		    switch(nota){
		        case 1:
		        case 2:
		            System.out.print("A nota  e : E");
		            break;
		        case 3:
		        case 4:
                case 5:
		            System.out.print("A nota e : D ");
		            break;
		        case 6:
		        case 7:
		            System.out.println("A nota e : C ");
		            break;
		        case 8 :
		        case 9 :
		            System.out.println("A nota e : B ");
		            break;
		        case 10:
		            System.out.println(" a nota e : A ");
		            break;
		        default:
		        System.out.println("nota invalida");
		            
		            
		            
		            }
		    
		    
		}while(nota <= 1);
		teclado.close();
		
		
		
		
	}
}
