package classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        var p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        
        Produto p2 = new Produto("Caneta Preta", 12.56);
        // p2.nome = "Caneta Preta";
        // p2.preco = 12.56;
        // p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p1.precoDescontado());

        System.out.println(p2.nome);
        System.out.println(p2.preco);
    }
}
