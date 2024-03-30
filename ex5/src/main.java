
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite a marca do seu carro:" );
        String marca = leitor.nextLine(); 

        System.out.println("Digite o modelo do seu carro:" );
        String modelo = leitor.nextLine(); 

        System.out.println("Digite a placa do seu carro:" );
        String placa = leitor.nextLine();

        System.out.println("Digite o ano do seu carro:" );
        int ano = leitor.nextInt(); 

        System.out.println("Digite a velAt do seu carro:" );
        float velAt = leitor.nextFloat();

        carro carro1 = new carro(marca, modelo, ano, placa, velAt);
        carro1.exibirInfo();

        System.out.println("Digite qual opcao você deseja:  1- acelerar 2- desacelerar: ");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Acelerando...velocidade atual: " + (velAt + random.nextInt(100)) + "km/h");
                break;
            case 2:
                System.out.println("Freando...velocidade atual: " + (velAt + (random.nextInt(100) + 1) * - 1) + "km/h");;
                break;
        }

         leitor.close();
    }

}
