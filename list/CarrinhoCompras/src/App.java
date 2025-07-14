
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        int opcao = -1;

        while(opcao != 0) {
            System.out.println("==============MENU==============");
            System.out.println("1 - Adicionatr Itens no carrinho");
            System.out.println("2 - Remover itens");
            System.out.println("3 - Calcular valor total");
            System.out.println("4 - Exibir itens");
            System.out.println("0 - Encerrar programa");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1: 
                System.out.println("Nome do produto: ");
                String nome = scanner.next();
                System.out.println("Valor do produto: ");
                double preco = scanner.nextDouble();
                System.out.println("Quantidade: ");
                int quantidade = scanner.nextInt();

                carrinho.adicionarItem(nome, preco, quantidade);
                System.out.println("item adicionado!");
                break;

                case 2:
                System.out.println("Qual item deseja remover");
                String remover = scanner.next();
                carrinho.removerItem(remover);
                System.out.println("Item removido!");
                break;

                case 3:
                double total = carrinho.calcularValorTotal();
                System.out.println("O valor total do carrinho é de R$" + total);
                break;

                case 4: 
                System.out.println("Itens do carrinho: ");
                carrinho.exibirItens();
                break;

                case 0:
                System.out.println("Programa encerrado");
                break;

                default:
                System.out.println("Opção invalida, tente novamente!");
            }
               
        }
        
    }
}
