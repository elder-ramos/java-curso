package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {
    public static void main(String[] args) {
        
        Set<String> listaAprovados = new HashSet<>(); // ou HashSet<String>();
        listaAprovados.add("Elder");
        listaAprovados.add("Carlos");
        listaAprovados.add("Amanda");
        listaAprovados.add("Pedro");

        System.out.println(listaAprovados);

        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new TreeSet<>();
        nums.add(3);
        nums.add(6);
        nums.add(1);
        nums.add(2);

        System.out.println(nums);

        for(int num: nums){
            System.out.println(num);
        }
    }
}
