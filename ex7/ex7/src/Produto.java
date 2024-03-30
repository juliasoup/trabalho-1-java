import java.util.ArrayList;
import java.util.Scanner;
public class Produto {
    private String nome;
    private int cod;
    private double preco;
    private int qtd;

    public Produto(String nome, int cod, double preco, int qtd) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.qtd = qtd;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    
    public double calcularTotal() {
        return preco * qtd;
    }


    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + cod);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + qtd);
    }
}


