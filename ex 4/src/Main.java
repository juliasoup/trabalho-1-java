import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        jogador jogador1 = new jogador("Jogador1", 0, 1);
        jogador1.aumentarPontuacao();
        jogador1.subirdeNivel();
        jogador1.exibirInfo();
    }
    
}
