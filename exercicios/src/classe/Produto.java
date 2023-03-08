package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    Produto(){

    }

    double precoDescontado(){
        return preco *(1 - desconto);
    }   
}
