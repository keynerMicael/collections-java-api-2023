
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> produtosList;

    public CarrinhoDeCompras(){
        this.produtosList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double  preco, int quantidade) {
        produtosList.add(new Item(nome, preco, quantidade));

    }

    public void removerItem(String nome) {
        List<Item> itensRecusados = new ArrayList<>();
        for(Item i : produtosList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensRecusados.add(i);
            }
        }
        produtosList.removeAll(itensRecusados);
    }

    public void calcularValorTotal() {
        
    }

}
