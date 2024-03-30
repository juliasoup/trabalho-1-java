import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner leitor=new Scanner(System.in);

       System.out.println("Digite o primeiro número: ");
       float n1 = leitor.nextFloat();
       leitor.nextLine();

       System.out.println("Digite o segundo número: ");
       float n2 = leitor.nextFloat();
       leitor.nextLine();

       System.out.println("Digite qual operação você deseja:  1- adição 2- subtração 3- divisão 4- multiplicação: ");
       int operação = leitor.nextInt();

       switch (operação){
            case 1:
                calculadora.adicao(n1,n2);
                break;
            case 2:
                calculadora.subtracao(n1,n2);
                break;
            case 3:
                calculadora.divisao(n1,n2);
                break;
            case 4:
                calculadora.multiplicacao(n1,n2);
                break;
           }

           leitor.close();

    }
}
