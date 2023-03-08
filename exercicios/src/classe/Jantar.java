package classe;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("feijão", 0.5);
        Comida c2 = new Comida("arroz", 0.5);

        Pessoa p1 = new Pessoa("Paulo", 85.500);
        p1.comer(c1);
        p1.comer(c2);

        System.out.printf("%s comeu %s (peso = %.3f) e %s (peso = %.3f). Seu peso inicial era %.3f e seu peso final é de %.3f", p1.nome, c1.nome, c1.peso, c2.nome, c2.peso, p1.peso, p1.pesoFinal);
    }
}
