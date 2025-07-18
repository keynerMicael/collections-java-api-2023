
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();

        int opcao = -1;
        
        while(opcao != 0) {
            System.out.println("==========MENU==========");
            System.out.println("1 - Adicionar números");
            System.out.println("2 - Ordenar números de forma ascendente");
            System.out.println("3 - Ordenar números de forma descendente");
            System.out.println("4 - Exibir números na lista");
            System.out.println("0 - Encerrar programa");
            System.out.println("========================");

            opcao = scanner.nextInt();

            switch(opcao) {

                case 1:
                System.out.println("Digite o numero que deseja adicionar: ");
                int numero = scanner.nextInt();
                ordenacao.adicionarNumero(numero);
                break;
                case 2:
                ordenacao.ordenarAscendente();
                break;
                case 3:
                ordenacao.ordenarDescendente();
                break;
                case 4: 
                ordenacao.exibirNumeros();
                break;
                case 0:
                System.out.println("Encerrando o priograma...");
                break;
                default:
                System.out.println("Opção invalida, tente novamente");
            }

        }
    }
}
