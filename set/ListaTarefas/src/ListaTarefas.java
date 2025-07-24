import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefas(String descricao) {
        boolean removido = tarefaSet.remove(new Tarefa(descricao));
        System.out.println(removido ? "Tarefa removida!" : "Tarefa não encontrada.");
    }

    public void exibirTarefas() {
        if(tarefaSet.isEmpty()) {
            System.out.println("Ainda não há tarefas na lista");
        } else {
            for(Tarefa t : tarefaSet) {
              System.out.println(t);  
            }
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            if(t.isConcluido()) {
                concluidas.add(t);
            }
        }
        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            if(!t.isConcluido()) {
                pendentes.add(t);
            }
        }
        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        boolean encontrada = false;
        for(Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(true);
                System.out.println("Tarefa marcada como concluida!");
                encontrada = true;
                break;
            }
        }
        if(!encontrada) {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        boolean encontrada = false;
        for(Tarefa t : tarefaSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(false);
                System.out.println("Tarefa marcada como pendente!");
                encontrada = true;
                break;
            }
        }
        if(!encontrada){
            System.out.println("Tarefa não encontrada");
        }
    }

    public void limparListaTarefas() {
        if(tarefaSet.isEmpty()) {
            System.out.println("A lista de tarefas ja esta vazia!");
        } else {
            tarefaSet.clear();
            System.out.println("Lista de tarefas limpa com sucesso!");
        }
    }

}
