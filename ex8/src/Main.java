import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static ArrayList<pedido> pedidos = new ArrayList<>();
    private static ArrayList<pizza> pizzas = new ArrayList<>();
    private static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        pizzas.add(new pizza("Margherita", 40.0, "Molho de tomate, queijo, manjericão"));
        pizzas.add(new pizza("Calabresa", 45.0, "Molho de tomate, queijo, calabresa, cebola"));

        boolean sair = false;
        while (!sair) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Novo Pedido");
            System.out.println("2. Cancelar Pedido");
            System.out.println("3. Mostrar Relatório de Pedidos");
            System.out.println("4. Sair");

            int opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    novoPedido();
                    break;
                case 2:
                    cancelarPedido();
                    break;
                case 3:
                    Relatorio();
                    break;
                case 4:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }

    public static void novoPedido() {
        System.out.println("Escolha uma pizza:");
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println((i+1) + ". " + pizzas.get(i).getNome() + " - R$" + pizzas.get(i).getValor());
        }
        int escolhaPizza = leitor.nextInt();
        if (escolhaPizza < 1 || escolhaPizza > pizzas.size()) {
            System.out.println("Opção inválida!");
            return;
        }
        pizza pizzaEscolhida = pizzas.get(escolhaPizza - 1);

        System.out.println("Escolha o tamanho da pizza:");
        System.out.println("1. Pequena");
        System.out.println("2. Média");
        System.out.println("3. Grande");
        int tamanhoEscolhido = leitor.nextInt();
        String tamanho;
        switch (tamanhoEscolhido) {
            case 1:
                tamanho = "Pequena";
                break;
            case 2:
                tamanho = "Média";
                break;
            case 3:
                tamanho = "Grande";
                break;
            default:
                System.out.println("Opção inválida, tamanho padrão definido como Média.");
                tamanho = "Média";
        }

        System.out.println("Digite o endereço de entrega:");
        leitor.nextLine(); 
        String endereco = leitor.nextLine();

        pedido novoPedido = new pedido(pizzaEscolhida, tamanho, endereco);
        pedidos.add(novoPedido);
        System.out.println("Pedido adicionado com sucesso!");
    }

    public static void cancelarPedido() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos para cancelar.");
            return;
        }
        System.out.println("Escolha o número do pedido que deseja cancelar:");
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println((i+1) + ". Pedido de " + pedidos.get(i).getPizza().getNome());
        }
        int escolha = leitor.nextInt();
        if (escolha < 1 || escolha > pedidos.size()) {
            System.out.println("Opção inválida!");
            return;
        }
        pedidos.remove(escolha - 1);
        System.out.println("Pedido cancelado com sucesso!");
    }

    public static void Relatorio() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos registrados.");
            return;
        }
        System.out.println("Relatório de Pedidos:");
        System.out.println("Número total de pedidos: " + pedidos.size());
        double totalPrecos = 0;
        for (pedido pedido : pedidos) {
            totalPrecos += pedido.getTotal();
        }
        double mediaPrecos = totalPrecos / pedidos.size();
        System.out.println("Média de preço dos pedidos: R$" + mediaPrecos);
    }
}

