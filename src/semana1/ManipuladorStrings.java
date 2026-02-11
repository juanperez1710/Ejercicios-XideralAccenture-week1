package semana1;

public class ManipuladorStrings {

    public static String invertir(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean esPalindromo(String s) {
        String limpio = s.toLowerCase().replaceAll("\\s+", "");
        return limpio.equals(invertir(limpio));
    }

    public static int contarVocales(String s) {
        int count = 0;
        String vocales = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String construirPiramide(int niveles) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= niveles; i++) {
            // Agregar espacios (niveles - i)
            for (int j = 0; j < niveles - i; j++) {
                sb.append(" ");
            }
            // Agregar asteriscos (2*i - 1)
            for (int k = 0; k < 2 * i - 1; k++) {
                sb.append("*");
            }
            // Salto de línea
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Invertir 'Hola Mundo': "
                + invertir("Hola Mundo"));
        System.out.println("'Anita lava la tina' es palindromo: "
                + esPalindromo("Anita lava la tina"));
        System.out.println("Vocales en 'Murcielago': "
                + contarVocales("Murcielago"));
        System.out.println("Piramide de 5 niveles:");
        System.out.println(construirPiramide(5));
    }
}
