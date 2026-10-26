import java.util.Scanner;

public class CalcularSueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sueldo, St;
        int horasExtras, Op;

        int c1 = 30;
        int c2 = 38;
        int c3 = 50;
        int c4 = 70;

        System.out.print("Cual es tu sueldo: ");
        sueldo = scanner.nextDouble();

        System.out.print("Cuantas horas extras son: ");
        horasExtras = scanner.nextInt();

        System.out.println("Selecciona la categoria: ");
        System.out.println("    Chalan 1.");
        System.out.println("    Maistro 2.");
        System.out.println("    Arquitecto 3.");
        System.out.println("    Ingeniebrio 4.");
        Op = scanner.nextInt();

        switch (Op) {
            case 1:
                St = horasExtras * c1 + sueldo;
                System.out.println("Su sueldo es de: " + St);
                break;
            case 2:
                St = horasExtras * c2 + sueldo;
                System.out.println("Su sueldo es de: " + St);
                break;
            case 3:
                St = horasExtras * c3 + sueldo;
                System.out.println("Su sueldo es de: " + St);
                break;
            case 4:
                St = horasExtras * c4 + sueldo;
                System.out.println("Su sueldo es de: " + St);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }
}
