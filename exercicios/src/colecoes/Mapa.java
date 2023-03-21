package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo"); // Mesma key = sobrescrever
        usuarios.put(2, "Amanda");
        usuarios.put(3, "Elder");
        usuarios.put(4, "Gabriel");
        usuarios.put(5, "Pedro");
        
        System.out.println(usuarios.keySet()); // valores chave
        System.out.println(usuarios.values()); // valores coluna 2
        System.out.println(usuarios.entrySet()); // os dois valores de uma vez
        System.out.println(usuarios.get(1)); // pegar valor baseado na chave

        System.out.println(usuarios.containsKey(5)); // checagem de key
        System.out.println(usuarios.containsValue("Elder")); // checagem de value
        System.out.println(usuarios.size()); // tamanho do map

        // ForEach de key
        for(int k: usuarios.keySet()){
            System.out.println("Key: " + k);
        }

        // ForEach de values
        for(String v: usuarios.values()){
            System.out.println("Value: " + v);
        }

        // ForEach de ambos
        for(Entry<Integer, String> s: usuarios.entrySet()){
            System.out.println("Key + value: " + s);
        }
    }
}
