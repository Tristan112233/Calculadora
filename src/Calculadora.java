import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Calculadora calc = new Calculadora();

            boolean salir = false;
            while (!salir) {
                System.out.println("Ingrese un número: ");
                double x = input.nextDouble();
                System.out.println("Ingrese otro número: ");
                double y = input.nextDouble();

                System.out.println("Seleccione una operación: ");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Exponencial");
                System.out.println("6. Salir");

                int opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("El resultado de la suma es: " + calc.suma(x, y));
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: " + calc.resta(x, y));
                        break;
                    case 3:
                        System.out.println("El resultado de la multiplicación es: " + calc.multiplicacion(x, y));
                        break;
                    case 4:
                        if (y == 0) {
                            System.out.println("No se puede dividir entre cero.");
                        } else {
                            System.out.println("El resultado de la división es: " + calc.division(x, y));
                        }
                        break;
                    case 5:
                        System.out.println("El resultado de la exponencial es: " + calc.exponencial(x, y));
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }
            }
        }
    }

    public double suma(double x, double y) {
        return x + y;
    }

    public double resta(double x, double y) {
        return x - y;
    }

    public double multiplicacion(double x, double y) {
        return x * y;
    }

    public double division(double x, double y) {
        return x / y;
    }

    public double exponencial(double x, double y) {
        return Math.pow(x, y);
    }
}