
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
       numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if(numeros.isEmpty()) {
         System.out.println("Não há numeros para somar!");
         return 0;
        }
        for ( int num : numeros) {
            soma += num;
        }
        return soma;
    }

    public void encontrarMaiorNumero() {
        if(numeros.isEmpty()) {
            System.out.println("Não há numeros na lista");
        } else {
            int maior = numeros.get(0);

            for ( int num : numeros) {
                if(num > maior) {
                    maior = num;
                }
            }

            System.out.println("Maior numero: " + maior);
        }
    }

    public void encontrarMenorNumero() {
        if(numeros.isEmpty()) {
            System.out.println("Não há numeros na lista");
        } else {
            int menor = numeros.get(0);

            for( int num : numeros) {
                if( num < menor) {
                    menor = num;
                }
            }

            System.out.println("Menor numero: " + menor);
        }
    }

    public void exibirNumeros() {
        if(numeros.isEmpty()) {
            System.out.println("A lista esta vazia");
        } else {
            System.out.println("Numeros na lista: " + numeros);
        }
    }
}
