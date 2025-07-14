
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

    public double calcularValorTotal() {
        double total = 0;
        for(Item item : produtosList) {
            total += item.getValorTotal();
        }
        return total;
    }

    public void exibirItens() {
        if(produtosList.isEmpty()) {
            System.out.println("O carrinho esta vazio");
        } else {
            for(Item item : produtosList) {
                System.out.println(item);
            }
        }
    }

}
