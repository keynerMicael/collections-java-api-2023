public class Aluno implements Comparable<Aluno>{

    private String nome;
    private Long  matricula;
    private double nota;

    public Aluno(String nome, long  matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;

    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof  Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return matricula.equals(aluno.matricula);
    }

    @Override 
    public int hashCode() {
        return matricula.hashCode();
    }

    @Override
    public int compareTo(Aluno outro) {
        return this.nome.compareToIgnoreCase(outro.nome);
    }
 
}
