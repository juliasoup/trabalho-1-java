import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        
        System.out.println("Digite o nome do titular da conta: ");
        String titular = leitor.nextLine();
        System.out.println("Digite o numero da conta: ");
        int numero = leitor.nextInt();

        double saldoInicial = 0.0;
        System.out.println("Saldo disponível na conta: " + saldoInicial);
        
        boolean continuar = true;
        while (continuar) {
        System.out.println("Você deseja 1-depositar 2-sacar: ");
        int operacao = leitor.nextInt();

        ContaBancaria conta = new ContaBancaria(titular, numero, saldoInicial);
        double valorOperacao;

        switch (operacao){
            case 1:
                System.out.println("Digite o valor a ser depositado: ");
                valorOperacao = leitor.nextInt();
                conta.deposito(valorOperacao);
                break;
            case 2:
                System.out.println("Digite o valor a ser sacado: ");
                valorOperacao = leitor.nextInt();
                conta.sacar(valorOperacao);
                break;
        }
        
        System.out.println("Saldo final da conta: " + conta.getSaldo());

        System.out.println("Deseja realizar outra transação? 1- sim 2- não");
        int opcao = leitor.nextInt();

        if (opcao == 1){
            continuar = true;
        } else if ( opcao == 2) {
            System.out.println("volte sempre!");
            continuar = false;
        }
    
    }
    
    leitor.close();
  }
}

