package fundamentos;

public class desafioOperadoresAritmeticos {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        double cimaDiv1 = 6 * (3 + 2);
        double baixoDiv1 = 3 * 2;
        double resultDiv1 = Math.pow(cimaDiv1, 2) / baixoDiv1;
        
        double cimaDiv2 = (1-5) * (2 - 7);
        double baixoDiv2 = 2;
        double resultDiv2 = Math.pow(cimaDiv2 / baixoDiv2, 2);

        double totalDivCima = Math.pow(resultDiv1 - resultDiv2, 3);
        double totalDivBaixo = Math.pow(10, 3);

        double resultado = totalDivCima / totalDivBaixo;

        System.out.println(resultado);
    }
}
