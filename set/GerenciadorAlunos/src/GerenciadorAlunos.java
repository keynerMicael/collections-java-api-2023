import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(Long matricula) {
        if(alunosSet.isEmpty()) {
            System.out.println("Ainda não há alunos na lista");
            return;
        } 

        Aluno alunoParaRemover = null;
        for(Aluno aluno : alunosSet) {
            if(aluno.getMatricula().equals(matricula)) {
                alunoParaRemover = aluno;
                break;
            }
        }

        if(alunoParaRemover != null) {
            alunosSet.remove(alunoParaRemover);
            System.out.println("Aluno removido com sucesso.");
        } else {
            System.out.println("Aluno com essa matricula não encontrado.");
        }
    }

    public void exibirAlunoPorNome() {
        TreeSet<Aluno> alunosNome = new TreeSet<>(alunosSet);
        if(alunosSet.isEmpty()) {
            System.out.println("Não há alunos na lista.");
            return;
        } else {
            for(Aluno aluno : alunosNome) {
                System.out.println(aluno.getNome() + " - Matricula: " + aluno.getMatricula() + " - nota: " + aluno.getNota());
            }
        }
    }

    public void exibirAlunosPorNota() {
        if(alunosSet.isEmpty()) {
            System.out.println("Ainda não há alunos na lista.");
            return;
        }
        
        Set<Aluno> alunosPorNotas = new TreeSet<>(Comparator.comparingDouble(Aluno::getNota));

        alunosPorNotas.addAll(alunosSet);

        for(Aluno aluno : alunosPorNotas) {
            System.out.println(aluno.getNome() + " - Matricula: " + aluno.getMatricula() + " - nota: " + aluno.getNota());
        }
    }

    public void exibirAlunos() {
        if(alunosSet.isEmpty()) {
            System.out.println("Ainda não há alunos na lista!");
        } else{ 
            for(Aluno aluno : alunosSet) {
             System.out.println(aluno.getNome() + " - Matricula: " + aluno.getMatricula() + " - Nota: " + aluno.getNota());   
            }
        }
    }


}
