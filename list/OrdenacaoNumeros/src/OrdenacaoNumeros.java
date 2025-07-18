
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(numero);
    }

    public void ordenarAscendente() {
        Collections.sort(numeroList);
    }

    public void ordenarDescendente(){
        Collections.sort(numeroList, Collections.reverseOrder());
    }

    public void exibirNumeros() {
        System.out.println("Números " + numeroList);
    }

}
