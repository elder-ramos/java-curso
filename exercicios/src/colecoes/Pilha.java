package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<>();

        // MAIS COMENTÁRIOS NO ARQUIVO Fila!!!!
        livros.add("O pequeno príncipe"); // add retorna true ou false
        livros.push("A razão do amor"); // push retorna uma exceção se não conseguir adicionar
        livros.push("Uma farsa de amor na Espanha");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println("O livro foi removido: " + livros.poll());
        System.out.println("O livro foi removido: " + livros.remove());
        System.out.println("O livro foi removido: " + livros.pop());

    }
}
