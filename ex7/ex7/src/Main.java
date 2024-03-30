import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static ArrayList<Produto> estoque = new ArrayList<>();
    private static Scanner leitor = new Scanner(System.in);

    public static void adicionarProduto() {
        System.out.println("Digite o nome do produto:");
        String nome = leitor.next();

        System.out.println("Digite o código do produto:");
        int cod = leitor.nextInt();

        System.out.println("Digite o preço do produto:");
        double preco = leitor.nextDouble();

        System.out.println("Digite a quantidade em estoque do produto:");
        int qtd = leitor.nextInt();

        Produto produto = new Produto(nome, cod, preco, qtd);
        estoque.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    public static void atualizarProduto() {
        System.out.println("Digite o código do produto que deseja atualizar:");
        int cod = leitor.nextInt();

        for (Produto produto : estoque) {
            if (produto.getCod() == cod) {
                System.out.println("Digite o novo nome do produto:");
                leitor.nextLine(); 

                String novoNome = leitor.nextLine();
                produto.setNome(novoNome);

                System.out.println("Digite o novo preço do produto:");
                double novoPreco = leitor.nextDouble();
                produto.setPreco(novoPreco);

                System.out.println("Digite a nova quantidade em estoque do produto:");
                int novaQtd = leitor.nextInt();
                produto.setQtd(novaQtd);

                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void removerProduto() {
        System.out.println("Digite o código do produto que deseja remover:");
        int cod = leitor.nextInt();

        for (Produto produto : estoque) {
            if (produto.getCod() == cod) {
                estoque.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void mostrarEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
            return;
        }

        System.out.println("Estoque:");
        for (Produto produto : estoque) {
            produto.exibirDetalhes();
            System.out.println("Valor total do produto: " + produto.calcularTotal());
            System.out.println();
        }
    }

    public static double valotttestoque() {
        double valorTotal = 0;
        for (Produto produto : estoque) {
            valorTotal += produto.calcularTotal();
        }
        return valorTotal;
    }

    public static void main(String[] args) {
        boolean sair = false;

        while (!sair) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Mostrar Estoque");
            System.out.println("5. Calcular Valor Total do Estoque");
            System.out.println("6. Sair");

            int opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    mostrarEstoque();
                    break;
                case 5:
                    System.out.println("Valor total do estoque: " + valorttestoque());
                    break;
                case 6:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}