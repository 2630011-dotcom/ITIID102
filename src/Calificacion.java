import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] materias = {
                "INGLÉS I",
                "DESARROLLO HUMANO Y VALORES",
                "FUNDAMENTOS MATEMÁTICOS",
                "FUNDAMENTO DE REDES",
                "FÍSICA",
                "FUNDAMENTOS DE PROGRAMACIÓN",
                "COMUNICACIÓN Y HABILIDADES DIGITALES",
                "TALLER"
        };

        System.out.println("=== SISTEMA DE CALIFICACIONES ===");

        for (int i = 0; i < materias.length; i++) {
            String materia = materias[i];
            System.out.println("\n--- " + materia + " ---");

            double sumaParciales = 0;
            for (int p = 1; p <= 3; p++) {
                System.out.print("Digite la calificación del parcial " + p + ": ");
                sumaParciales += entrada.nextDouble();
            }

            double promedioTotal = sumaParciales / 3.0;
            String estado = (promedioTotal < 7) ? "reprobatoria" : "aprobatoria";

            System.out.println(materia + " " + String.format("%.2f", promedioTotal) + " (" + estado + ")");
        }

        entrada.close();
    }
}
