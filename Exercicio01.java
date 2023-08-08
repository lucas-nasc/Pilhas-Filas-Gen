import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        String tabela =
                """
                ***********************************************************
                1- Adicionar Cliente na fila
                2- Listar todos os clientes
                3- Retirar cliente da fila
                0 - Sair
                ***********************************************************
                Entre com a opção desejada:
                """;
        int n1;
        String nome;

        Queue<String> fila = new LinkedList<String>();

        Scanner leia = new Scanner(System.in);

        System.out.println(tabela);

        while (true){
            n1 = leia.nextInt();
            switch (n1) {
                case 1:
                    System.out.println("\nDigite seu nome: ");
                    nome = leia.next();
                    fila.add(nome);
                    System.out.println("\nCliente adicionado! ");
                    break;

                case 2:
                    System.out.println("\nFila de clientes: ");
                    Iterator<String> iterator = fila.iterator();
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;

                case 3:
                    System.out.println(fila);
                    if (fila.isEmpty()){
                        System.out.println("A fila esta vazia");
                    }else {
                        fila.remove();
                        System.out.println("\nO cliente foi chamado");
                        System.out.println(fila);
                    }
                    break;
                case 0:
                    System.out.println("\nObrigado por utilizar nosso programa!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nopção invalida, digite uma das opções validas");

            }
            System.out.println("\nEntre com outra opçao: ");
        }

    }
}
