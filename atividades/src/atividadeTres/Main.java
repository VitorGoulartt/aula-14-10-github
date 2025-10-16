package atividadeTres;
import atividadeDois.Menu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Atleta atleta1 = new Atleta("vitor", "Peso-pena", 17, 73, 1.72 );
        Menu menu1 = new Menu();
        int atleta;
        boolean  desligar = false;
        System.out.println("-------------- BEM VINDO -------------");

        do{
            menu1.mostrarAtleta();
            atleta = sc.nextInt();
            switch(atleta){
                case 1:
                System.out.println("Nome do Atleta: ");
                atleta1.setnome(sc2.nextLine());
                System.out.println("Modalidade: ");
                atleta1.setmodalidade(sc2.nextLine());
                System.out.println("Idade: ");
                atleta1.setidade(sc2.nextInt());
                System.out.println("Peso do Atleta: ");
                atleta1.setpesokg(sc2.nextDouble());
                System.out.println("Altura do Atleta: ");
                atleta1.setalturaMetros(sc2.nextDouble());
                break;

                case 2:
                atleta1.calcularIMC(1);
                break;

                case 3:
                atleta1.classificarCategoria();
                break;
                case 4:
                atleta1.atualizarinfo();
                atleta1.setatualizar(sc.nextInt());
                switch(atleta1.getatualizar()){

			      case 1:
			     System.out.println("Novo nome: ");
			      atleta1.setnome(sc2.nextLine());
                  System.out.println("alterado com sucesso");
                 break;
			     case 2:
			     System.out.println("Nova Idade: ");
			     atleta1.setidade(sc2.nextInt());
                 System.out.println("alterado com sucesso");
                 break;
			     case 3:
			     System.out.println("Nova Modalidade: ");
			     atleta1.setmodalidade(sc2.nextLine());
                 System.out.println("alterado com sucesso");
                 break;
			     case 4:
			     System.out.println("Novo Peso: ");
			     atleta1.setpesokg(sc2.nextDouble());
                 System.out.println("alterado com sucesso");
                 break;
			     case 5:
			     System.out.println("Nova altura: ");
			     atleta1.setalturaMetros(sc2.nextDouble());
                 System.out.println("alterado com sucesso");
                 break;
			     default:
			     System.out.println("Opçao invalida");
                 break;

		        }
                break;
                case 5:
               atleta1.exibirInfo();
               break;

                case 6:
                System.out.println("Encerrando Sistema");
                desligar = true;
                break;
                



            }


        }while(desligar != true);
        sc.close();
        sc2.close();
       

    }
}
