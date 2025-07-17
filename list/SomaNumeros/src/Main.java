
import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        SomaNumeros somanum = new  SomaNumeros();
        
        int opcao = -1;

        while(opcao != 0) {
            System.out.println("=========MENU==========");
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Calcular soma");
            System.out.println("3 - Encontrar maior número");
            System.out.println("4 - Encontrar menor número");
            System.out.println("5 - Exibir números");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opção: ");

            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                System.out.println("Digite um numero para adicionar: ");
                int num = scanner.nextInt();
                somanum.adicionarNumero(num);
                System.out.println("Número adicionado!");
                break;
                case 2:
                int soma = somanum.calcularSoma();
                System.out.println("Soma dos números: " + soma);
                break;
                case 3:
                somanum.encontrarMaiorNumero();
                break;
                case 4:
                somanum.encontrarMenorNumero();
                break;
                case 5:
                somanum.exibirNumeros();
                break;
                case 0: 
                System.out.println("Encerrando priograma!...");
                break;
                default:
                System.out.println("opçao invalida! tente novamemnte");

            }
        }


        System.out.println("Hello, World!");
    }
}
