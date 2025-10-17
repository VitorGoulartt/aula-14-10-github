package atividadeCinco;
import atividadeDois.Menu;
import atividadeCinco.Animal;
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
                System.out.println("Marca do veiculo: ");
                carro1.setmarca(sc2.nextLine());
                System.out.println("Ano do veiculo: ");
                carro1.setano(sc2.nextInt());
                System.out.println("Quilometragem do veiculo: ");
                carro1.setquilometragem(sc2.nextDouble());
                break;
            }

        }while(cliente != 6);
       
        
    }

}
