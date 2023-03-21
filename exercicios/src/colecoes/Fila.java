package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Se a fila já estiver cheia (limite atingido) o Offer irá retornar "false", o add lança uma exceção;
        fila.add("Amanda");
        fila.offer("Elder");
        fila.offer("Rafaela");
        fila.offer("Manu");

        // Próximo elemento da fila (sem remover)!
        System.out.println(fila.peek()); // retorna false (se não tiver mais elemento)
        System.out.println(fila.element()); // retorna exceção (se não tiver mais elemento)

        // Próximo elemento da fila (REMOVENDO)!!!
        System.out.println(fila.poll()); //retorna false se não tiver mais nada
        System.out.println(fila.poll());
        System.out.println(fila.remove()); //lança uma exceção se não tiver mais nada

        // Outros métodos
        System.out.println("Qual o tamanho da fila? " + fila.size());
        System.out.println("A fila está vazia? " + fila.isEmpty());
        System.out.println("A fila contêm Manu? " + fila.contains("Manu"));


    }
}
