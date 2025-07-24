
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ListaTarefas lista = new ListaTarefas();

        int opcao = -1;

        while(opcao != 0) {
            System.out.println("==========MENU==========");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Exibir lista de tarefa(s)");
            System.out.println("4 - Contar tarefas");
            System.out.println("5 - Obter tarefas concluidas");
            System.out.println("6 - Obter tarefas pendentes");
            System.out.println("7 - Marcar tarefa como concluida");
            System.out.println("8 - Marcar tarefa como pendente");
            System.out.println("9 - Limpar lista de tarefas");
            System.out.println("0 - Encerrar programa");
            System.out.println("========================");

            opcao = Integer.parseInt(scanner.nextLine());

            switch(opcao) {
                case 1:
                System.out.println("Digite a tarefa que deseja adicionar: ");
                String tarefa = scanner.nextLine();
                lista.adicionarTarefa(tarefa);
                break;
                case 2:
                System.out.println("Digitre a tarefa que deseja remover da lista: ");
                String remover = scanner.nextLine();
                lista.removerTarefas(remover);
                break;
                case 3:
                lista.exibirTarefas();
                break;
                case 4:
                System.out.println("Total de tarefas: " + lista.contarTarefas());
                break;
                case 5:
                Set<Tarefa> concluidas = lista.obterTarefasConcluidas();
                System.out.println("Tarefas concluidas: ");
                for(Tarefa t : concluidas) {
                    System.out.println(t);
                }
                break;
                case 6:
                Set<Tarefa> pendentes = lista.obterTarefasPendentes();
                System.out.println("tarefas pendentes: ");
                for(Tarefa t : pendentes) {
                    System.out.println(t);
                }
                break;
                case 7:
                System.out.println("Digite a tarefa concluida: ");
                String concluida = scanner.nextLine();
                lista.marcarTarefaConcluida(concluida);
                break;
                case 8:
                System.out.println("Digite a tarefa pendente: ");
                String pendente = scanner.nextLine();
                lista.marcarTarefaPendente(pendente);
                break;
                case 9:
                lista.limparListaTarefas();
                break;
                case 0:
                System.out.println("Encerrando programa...");
                break;
                default:
                System.out.println("opção invalida! tente novamente.");

            }
        }
        scanner.close();
    }
}
