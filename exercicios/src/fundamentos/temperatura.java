package fundamentos;

public class temperatura {

    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        final int fator = 32;
        final double multiplicador = 5.0/9.0;
        int fahrenheint = 86;
        double result = (fahrenheint - fator) * multiplicador;

        System.out.println("O resultado é: " + result + "°C");
    }
}
