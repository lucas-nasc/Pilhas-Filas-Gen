import java.util.Iterator;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<String>();

        //O ultimo elemento a entrar é o primeiro a sair

        //push inserir

        //pop exclui

        //peek mostra o elemento do topo da pilha

        pilha.push("Prato verde");
        pilha.push("Prato azul");
        pilha.push("Prato branco");
        pilha.push("Prato preto");

        System.out.println("\nElementos da pilha: " + pilha);

        //Retirando um elemento da pilha

        System.out.println("\nO elemento retirado vai ser o : "+pilha.pop());

        System.out.println(pilha);

        System.out.println("\nO elemento retirado vai ser o : "+pilha.pop());

        System.out.println(pilha);

        //mostrando o Elemento do topo

        System.out.println("\nElemento do topo da pilha "+pilha.peek());

        //Adicionando o elemento na pilha a qualquer momento.

        System.out.println("\nAdicionar um elemento na pilha" + pilha.push("Prato roxo"));

        //Tamanho da pilha

        System.out.println("Tamanho da pilha: " + pilha.size());

        //Se o prato existe na pilha

        System.out.println("O elemento prato verde existe na pilha? " + pilha.contains("Prato Verde"));

        //Iterator usando para exibir a pilha
        System.out.println("\nExibir todos os elementos da pilha atraves do Iterator:");

        Iterator<String> iterator =  pilha.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //pilha.clear(); tira todos os elementos da pilha
        pilha.clear();

        //Verifica se a pilha esta vazia e retora um verdadeiro ou falso
        //verdadeiro se a pilha estiver vazia
        //falso se nao estiver

        System.out.println("\n A pilha esta vazia? "+pilha.isEmpty());



    }
}
