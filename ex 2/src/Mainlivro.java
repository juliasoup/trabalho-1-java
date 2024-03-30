
import java.util.*;
public class Mainlivro {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);

        System.out.println("Digite o titulo do livro:" );
        String titulo = leitor.nextLine();

        System.out.println("Digite o autor do livro:" );
        String autor = leitor.nextLine();

        System.out.println("Digite o ano de lançamento do livro:" );
        int ano = leitor.nextInt();

        livro livro1 = new livro(titulo, autor, ano);
        livro1.exibirInfo(); 

        leitor.close();
    }


}

