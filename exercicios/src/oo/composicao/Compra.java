package oo.composicao;

import java.util.ArrayList;

public class Compra {
    
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    double valorTotal(){
        double soma = 0;
        for(Item i: itens){
            soma += i.quantidade * i.preco;
        }
        return soma;
    }
}
