package atividadeQuatro;
import atividadeDois.Menu;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Carro carro1 = new Carro("Sedan", "toyota", 1998 , 12000);
        Menu menu1 =new Menu();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int cliente = 0;


        do{
            menu1.mostrarCarro();
            cliente = sc.nextInt();

            switch(cliente){
                case 1:
                System.out.println("Modelo do veiculo: ");
                 carro1.setmodelo(sc2.nextLine());
                System.out.println("Marca do veiculo: ");
                carro1.setmarca(sc2.nextLine());
                System.out.println("Ano do veiculo: ");
                carro1.setano(sc2.nextInt());
                System.out.println("Quilometragem do veiculo: ");
                carro1.setquilometragem(sc2.nextDouble());
                break;

                case 2:
                System.out.println("Qual e a nova quilometragem?");
                carro1.atualizarQuilometragem(sc.nextDouble());
                break;

                case 3:
                carro1.calcularIdadeVeuiculo();
                break;
                case 4:
                carro1.exibirInformarçoes();
                break;
                case 5:
                System.out.println("Encerrando sistema");



            }

        }while(cliente != 5);

        sc.close();
        sc2.close();
        




    }

}
