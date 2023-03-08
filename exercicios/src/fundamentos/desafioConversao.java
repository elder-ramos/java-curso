package fundamentos;

import java.util.Scanner;

public class desafioConversao {
    
    public static void main(String[] args) {
        // 3 ultimos salarios como string
        // Converter em double e fazer média
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite seu primeiro salário");
            String sal1 = entrada.next().replace(",", ".");

            System.out.println("Digite seu segundo salário");
            String sal2 = entrada.next().replace(",", ".");;

            System.out.println("Digite seu terceiro salário");
            String sal3 = entrada.next().replace(",", ".");

            final double media = (Double.parseDouble(sal1) + Double.parseDouble(sal2) + Double.parseDouble(sal3)) / 3;

            System.out.printf("A média dos seus três últimos salários é de: %.2f", media);
        }
    }
}
