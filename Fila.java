import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();

        //primeiro elemento que entra é o primeiro elemento que é removido

        for (int i =0; i<=10;i++){
            fila.add(i);// adicionando elementos na fila
        }

        System.out.println("\nElementos da fila" + fila);
        System.out.println("\nRemovendo elemento da fila: " + fila.remove()); //remove um elemento da fila
        System.out.println("\nElementos da fila depois de remover: "+fila);
        System.out.println("\nAdicionando o elemento 11: "+ fila.add(11));
        System.out.println("\nPegar o elemento da fila: " + fila.peek());//Pega o  elemento da fila
        System.out.println("\nPegar o tamanho da fila: " + fila.size());//mostra o tamanho da fila
        System.out.println("\nVerificando um elemento da fila " + fila.contains(37));// boolean true or false para mostrar se tem o elemento na lista
        System.out.println("\nExibir e retirar o primeiro elemento da fila: "+ fila.poll());//Exibe e vai remove o primeiro elemento da fila
        System.out.println("\nFila atual: " + fila);

        Iterator<Integer> iterator = fila.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Limpar a fila: ");
        fila.clear();

        System.out.println("a fila esta vazia ? " +fila.isEmpty());




    }
}
