import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    Scanner sc = new Scanner(System.in);
    System.out.println("********************************");
    System.out.println("Cadastrar Pessoa");
    System.out.println("Digite o Nome:");
    pessoa.setNome(sc.nextLine());
    System.out.println("Digite a Idade:");
    pessoa .setIdade(sc.nextInt());
    System.out.println("Digite o Sexo :");
    String sexo = sc.next();

    while (!pessoa.verificaSexo(sexo)){
            System.out.println("Digite o Sexo :");
            pessoa.verificaSexo(sc.next());
            
        }
    }
}