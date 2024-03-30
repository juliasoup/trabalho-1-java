import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        Agenda agenda=new Agenda();
        
        
        System.out.println("Adicionando novo contato a agenda...");

        boolean continuar = true;
        while ( continuar) {
             System.out.println("Digite o nome do contato a ser salvo:");
            String nome = leitor.next();

            System.out.println("Digite o numero do contato a ser salvo:");
            float numero = leitor.nextFloat();

            Contato novocontato = new Contato(nome, numero);
            agenda.addCnt(novocontato);

            System.out.println("Contato adicionado com sucesso.");

            System.out.println(agenda);

            System.out.println("Deseja adicionar outro contato? 1- sim 2- não");
            int opcao = leitor.nextInt();

            if (opcao == 1){
            continuar = true;
            } else if ( opcao == 2) {
            System.out.println("Até logo!");
            continuar = false;
            }
        }    
        leitor.close();
    }
}

