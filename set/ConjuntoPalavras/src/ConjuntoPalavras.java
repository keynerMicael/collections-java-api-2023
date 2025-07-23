
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavras {

    private Set<String> conjunto;

    public ConjuntoPalavras() {
        this.conjunto = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        if(conjunto.add(palavra)) {
        System.out.println("Palavra adicionada com sucesso.");
        } else {
            System.out.println("Essa palavra já esta no conjunto");
        }
    }

    public void removerPalavra(String palavra) {
        if(conjunto.isEmpty()) {
            System.out.println("Não há palavras para remover");
        } else {
            if(conjunto.remove(palavra)) {
                System.out.println("Palavra removida: " + palavra);
            } else {
                System.out.println("A palavra '" + palavra + "' não esta no conjunto.");
            }
        }
    }

    public void verificarPalavra(String palavra) {
        if(conjunto.isEmpty()) {
            System.out.println("Não há palavras no conjunto!");
        } else {
            if(conjunto.contains(palavra)) {
                System.out.println("A palavra '" + palavra + "' ja esta no conjunto");
            } else {
                System.out.println("A palavra '" + palavra + "' não esta no conjunto");
            }
        }
    }

    public void exibirPalavrasUnicas() {
        if(conjunto.isEmpty()) {
            System.out.println("Não há letras para exibir");
        } else {
            System.out.println("palavras no conjunto: ");
            for(String p : conjunto) {
                System.out.println(p);
            }
        }
    }



    

}
