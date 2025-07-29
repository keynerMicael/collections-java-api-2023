
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        int opcao = -1;

        while(opcao != 0) {
            System.out.println("==========MENU==========");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Exibir alunos por nome");
            System.out.println("4 - Exibir alunos por nota");
            System.out.println("5 - Exibir alunos");
            System.out.println("0 - Encerrar programa");
            System.out.println("========================");

            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                System.out.println("Nome do aluno: ");
                String nome = scanner.next();
                System.out.println("Matricula do aluno: ");
                long matricula = scanner.nextLong();
                System.out.println("Nota do aluno: ");
                double nota = scanner.nextDouble();
                alunos.adicionarAluno(nome, matricula, nota);
                break;
                case 2:
                System.out.println("Nome do aluno que deseja remover: ");
                long remove = scanner.nextLong();
                alunos.removerAluno(remove);
                break;
                case 3:
                alunos.exibirAlunoPorNome();
                break;
                case 4:
                alunos.exibirAlunosPorNota();
                break;
                case 5:
                alunos.exibirAlunos();
                break;
                case 0:
                System.out.println("Encerrando programa....");
                break;
                default:
                System.out.println("Opção invalida tente novamente!");
                break;
            }
        }
    }
}
