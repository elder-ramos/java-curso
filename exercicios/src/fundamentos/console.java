package fundamentos;

import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            String nome = entrada.nextLine();

            System.out.printf("Seu nome é %s", nome);
        }
    }
}
