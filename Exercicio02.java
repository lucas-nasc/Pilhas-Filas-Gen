import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {
    public static void main(String[] args) {
        String tabela =
                """
                 ***********************************************************
                1- Adicionar livro na pilha
                2- Listar todos os livros
                3- Retirar livro da pilha
                0 - Sair
                ***********************************************************
                Entre com a opção desejada:
                """;
        int opcao;
        String livro;

        Scanner leia = new Scanner(System.in);

        Stack<String> pilha = new Stack<String>();

        System.out.println(tabela);
        while (true){
            opcao = leia.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    livro = leia.next();
                    pilha.push(livro);
                    System.out.println("\n Livro adicionado");
                    break;
                case 2:
                    System.out.println("Lista de livros na pilha são");

                    Iterator<String> iterator = pilha.iterator();
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()){
                        System.out.println("A pilha esta vazia");
                    }else {
                        pilha.pop();
                        System.out.println("Pilha");
                        System.out.println(pilha);
                        System.out.println("Um livro foi retirado da pilha");
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar nosso programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Esse opção é invalida, digite uma opção vaalida");

            }
            System.out.println("\nDigite a uma opção: ");
        }


    }
}
