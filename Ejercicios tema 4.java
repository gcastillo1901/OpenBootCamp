public class EstructurasDeControl {
    public static void main(String[] args) {
        // Estructura If
        int numeroIf = 5;
        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }

        // Estructura While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Valor de numeroWhile: " + numeroWhile);
        }

        // Estructura Do-While
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("Valor de numeroDoWhile: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        // Estructura For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Valor de numeroFor: " + numeroFor);
        }

        // Estructura Switch
        String estacion = "otoño";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera.");
                break;
            case "verano":
                System.out.println("Estamos en verano.");
                break;
            case "otoño":
                System.out.println("Estamos en otoño.");
                break;
            case "invierno":
                System.out.println("Estamos en invierno.");
                break;
            default:
                System.out.println("Estación no válida.");
                break;
        }
    }
}
