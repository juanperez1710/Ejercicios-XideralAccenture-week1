package semana1;

public class HolaMundoMejorado {
    public static void main(String[] args) {
        // TODO: Declarar variables
        String nombre = "Juan";
        int edad = 29;
        double altura = 1.66;
        boolean esActivo = true;


        String mensaje1 = "Me llamo " + nombre + ", tengo " + edad
                + " anios, mido " + altura + "m y estoy "
                + (esActivo ? "activo" : "inactivo") + ".";
        System.out.println(mensaje1);


        String mensaje2 = String.format(
                "Me llamo %s, tengo %d anios, mido %.2f m y estoy %s.",
                nombre, edad, altura, esActivo ? "activo" : "inactivo"
        );
        System.out.println(mensaje2);
    }
}
