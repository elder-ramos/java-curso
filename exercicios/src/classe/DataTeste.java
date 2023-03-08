package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(2, 6, 2004);
        // d1.dia = 2;
        // d1.mes = 6;
        // d1.ano = 2004;

        System.out.println(d1.obterDataFormatada());

        var d2 = new Data();
        d2.dia = 12;
        d2.mes = 7;
        d2.ano = 1983;

        var d3 = new Data();

        System.out.println(d3.obterDataFormatada());

        System.out.printf(d2.obterDataFormatada());
    }
}
