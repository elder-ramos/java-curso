package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) throws Exception {
        try (// While - Somar um numero N de notas e contar quantas notas foram somadas.
                // No fim, dar a média.
        Scanner entrada = new Scanner(System.in)) {
            double nota = 0;
            double contador = 0;
            double total = 0;

            while(nota != -1){
                nota = entrada.nextDouble();
                if(nota <= 10 && nota >= 0){
                    total += nota;
                    contador++;
                }else{
                    System.out.println("Digite uma nota válida.");
                }
            }
            
            double media = total/contador;

            System.out.printf("A quantidade total de notas foi de %.2f\n", contador);
            System.out.printf("E a média é de: %.2f", media);
        }
        
    }
}
