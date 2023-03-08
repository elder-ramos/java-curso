package classe;

public class Pessoa {
    String nome;
    double peso;
    double pesoFinal;


    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
        pesoFinal = peso;
    }

    // METODO COMER
    void comer(Comida comida){
        if(comida != null){
            pesoFinal = pesoFinal + comida.peso;
        }
    }
}
