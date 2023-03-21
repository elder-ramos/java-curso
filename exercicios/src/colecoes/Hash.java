package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Elder"));
        usuarios.add(new Usuario("Amanda"));

        boolean resultado = usuarios.contains(new Usuario("Elder"));

        System.out.println(resultado);
    }
}
