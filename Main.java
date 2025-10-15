import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Atleta atleta1 = new Atleta("vitor", "volei", 17, 73, 1.72 );
        Menu menu1 = new Menu();
        int atleta;
        System.out.println("-------------- BEM VINDO -------------");

        do{
            menu1.mostrar();
            atleta1 = sc.nextInt();
            switch(atleta){
                case 1:
                



            }


        }
        //atleta1.calcularIMC(1);

    }
}
