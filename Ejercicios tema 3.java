// Primera parte: Función que suma tres números
public class Sumar {
    public static int suma(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }
}

// Segunda parte: Clase Coche
public class Coche {
    private int numeroPuertas;

    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void incrementarNumeroPuertas() {
        numeroPuertas++;
    }
}

// Clase principal (Main)
public class Main {
    public static void main(String[] args) {
        // Llamada a la función suma
        int resultadoSuma = Sumar.suma(1, 2, 3);
        System.out.println("El total de la suma es: " + resultadoSuma);

        // Creación de objeto Coche e incremento del numero de puertas
        Coche miCoche = new Coche(2);
        System.out.println("Número de puertas del coche: " + miCoche.getNumeroPuertas());

        miCoche.incrementarNumeroPuertas();
        System.out.println("Número de puertas del coche después de incrementar: " + miCoche.getNumeroPuertas());
    }
}