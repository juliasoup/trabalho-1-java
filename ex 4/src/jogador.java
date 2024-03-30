import java.util.Scanner;
public class jogador {
    private String nome;
    private double pont;
    private int nivel;


    public jogador(String nome, double pont, int nivel){
        this.nome = nome;
        this.nivel = nivel;
        this.pont = pont;
    }

    public void aumentarPontuacao() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a pontuação que deseja adicionar: ");
        int valor = leitor.nextInt();
        if (valor > 0) {
            pont += valor;
            System.out.println("Pontuação adicionada com sucesso.");
        } else {
            System.out.println("Valor inválido para aumentar pontuação.");
        }
        leitor.close();
    }

    public void subirdeNivel() {
        nivel++;
        System.out.println("O jogador subiu para o nível " + nivel + ".");
    }

    
    public void exibirInfo() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação: " + pont);
        System.out.println("Nível: " + nivel);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPont() {
        return pont;
    }

    public void setPontuacao(int pont) {
        this.pont = pont;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


}