package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class desafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual será o tamanho do array?");
        int total = entrada.nextInt();

        double[] arrNotas = new double[total];

        for(int i = 0; i < total; i++){
            System.out.printf("Digite o valor do índice %d: ", i);
            double valor = entrada.nextDouble();
            arrNotas[i] = valor;
        }

        double soma = 0;
        for(double notas: arrNotas){
            soma += notas;
        }

        System.out.println(Arrays.toString(arrNotas));
        System.out.println(soma / total);

        entrada.close();
    }



}
