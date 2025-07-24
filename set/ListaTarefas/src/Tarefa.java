public class Tarefa {
    
    private String descricao;

    private boolean concluido;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluido = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return descricao + (concluido ? "[concluida]" : "[Pendente]"); 
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Tarefa)) return false;
        Tarefa tarefa = (Tarefa) o;
        return descricao.equalsIgnoreCase(tarefa.descricao);
    }

    @Override
    public int hashCode(){
        return descricao.toLowerCase().hashCode();
    }
}
