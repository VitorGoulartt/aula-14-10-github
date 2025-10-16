package atividadeDois;
import java.util.Scanner;
class Produto{
    Scanner sc = new Scanner(System.in);
    private String nome;
    private String codigo;
    private int quantidade;
    private double preçoUnitario;
    
    public Produto (String nome, String codigo, int quantidade, double preçoUnitario){
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preçoUnitario = preçoUnitario;
        
    }
    public String getnome(){
        return nome;
    }
    public String getcodigo(){
        return codigo;
    }
    public int getquantidade(){
        return quantidade;
    }
    public double getpreçoUnitario(){
        return preçoUnitario;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void  setcodigo(String codigo){
        this.codigo = codigo;
    }
    public void setquantidade(int quantidade){
        
        this.quantidade = quantidade;
        
    }
    public void setpreçoUnitario(double preçoUnitario){
        this.preçoUnitario = preçoUnitario;
    }
    public void adicionarEstoque(int quantidade){
        
        System.out.println("Quantos desejar adicionar ao Produto " + this.nome + " ?");
        quantidade = sc.nextInt();
        if(quantidade == 0 || quantidade <= 0){
            System.out.println("Valor invalidado");
            
        }else if (quantidade >= 500){
            System.out.println("valor nao aceito no estoque");
        }else{
            this.quantidade += quantidade;
        }
        
    }   
    public void removerEstoque(int quantidade){
        System.out.println("Quantos desejar Remover ao Produto " + this.nome + " ?");
        quantidade = sc.nextInt();
        if(quantidade == 0 || quantidade <= 0){
            System.out.println("Valor invalidado");
            
        }else if (quantidade > this.quantidade){
            System.out.println("Valor nao aceito no estoque");
        }else{
            this.quantidade -= quantidade;
        }
        
    }
    public void produtoAdicionar(){
        System.out.println("=== CADASTRO DE NOVO PRODUTO ===");
      System.out.print("Nome do produto: ");
        this.nome = sc.nextLine();
      System.out.print("codigo do produto: ");
        this.codigo = sc.nextLine();
      System.out.print("quantidade do produto: ");
         this.quantidade = sc.nextInt();
      System.out.print("Preço do produto: ");
         this.preçoUnitario = sc.nextDouble();
    }    
    public void info(){
        
        System.out.println("Produto: " + this.nome);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço: " + this.preçoUnitario);
    }
    
    
}


