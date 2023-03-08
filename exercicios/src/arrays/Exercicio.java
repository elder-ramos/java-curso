package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 10.0;
        notasAlunoA[2] = 3.0;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }
        double media = total / notasAlunoA.length;
        System.out.println(media);

        double[] notasAlunoB = {10, 5.8, 7.8, 8};
        System.out.println(Arrays.toString(notasAlunoB));

        // forEach
        for(double nota: notasAlunoB){
            System.out.println(nota);
        }
    }
}
