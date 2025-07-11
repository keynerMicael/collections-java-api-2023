import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaResolver = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaResolver.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaResolver);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

}
