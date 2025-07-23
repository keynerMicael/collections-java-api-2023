
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras();

        int opcao = -1;

        while(opcao != 0) {
            System.out.println("==========MENU==========");
            System.out.println("1 - Adicionar palavra");
            System.out.println("2 - Remover palavra");
            System.out.println("3 - Verificar palavra");
            System.out.println("4 - Exibir palavra(s) ");
            System.out.println("0 - Encerrar programa");
            System.out.println("========================");

            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                System.out.println("Digite a palavra que deseja adicionar ");
                String palavra = scanner.next();
                conjuntoPalavras.adicionarPalavra(palavra);
                break;
                case 2: 
                System.out.println("Qual palavra deseja remover? ");
                String remover = scanner.next();
                conjuntoPalavras.removerPalavra(remover);
                break;
                case 3:
                System.out.println("Qual palavra deseja verificar? ");
                String verificar = scanner.next();
                conjuntoPalavras.verificarPalavra(verificar);
                break;
                case 4:
                conjuntoPalavras.exibirPalavrasUnicas();
                break;
                case 0:
                System.out.println("Encerrando programa....");
                break;
                default:
                System.out.println("Opção ivalidda, tente novamente");
            }
        }
    }
}
