package atividadeCinco;
import atividadeDois.Menu;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Menu menu1 = new Menu();
        Animal animal1 = new Animal("Zeus", "Golden", 5, 25);
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int cliente = 0;
        do{
            menu1.mostrarAnimal();
            cliente = sc.nextInt();
            switch(cliente){
                case 1:
                 System.out.println("Nome do animal: ");
                 animal1.setnome(sc2.nextLine());
                System.out.println("Especie do Animal: ");
                animal1.setespecie(sc2.nextLine());
                System.out.println("Idade do Animal: ");
                animal1.setidade(sc2.nextInt());
                System.out.println("Peso do Animal: ");
                animal1.setpeso(sc2.nextDouble());
                break;
                
                case 2:
                System.out.println("Qual e o novo Peso?");
                animal1.atualizarPeso(sc.nextDouble());
                break;

                case 3:
                animal1.calcularIdadeEmAnosHUmanos();
                break;
                case 4:
                animal1.classificarPorte();
                break;
                case 5:
                animal1.exibirInformarçoes();
                break;
                case 6:
                System.out.println("Encerrando sistem");


            }

        }while(cliente != 6);
       sc.close();
       sc2.close();
        
    }

}
