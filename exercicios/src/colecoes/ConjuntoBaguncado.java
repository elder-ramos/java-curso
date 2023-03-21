package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();
        // Dados de todos os tipos podem ser adicionados ao Set!
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');
        // Não aceita repetição!
        conjunto.add("Teste"); // <- repetido
        System.out.println(conjunto.size());

        conjunto.remove(1.2);

        System.out.println(conjunto.size());
        System.out.println(conjunto.contains(1));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        // União
        // conjunto.addAll(nums);

        // Intercesão (comum)
        conjunto.retainAll(nums);

        // Limpar lista
        // conjunto.clear();
        System.out.println(conjunto);
    }
}
