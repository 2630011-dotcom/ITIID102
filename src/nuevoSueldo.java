import java.util.Scanner;
public class nuevoSueldo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldo, newSueldo;

        System.out.println("Ingrese el sueldo del Kevin: ");
        sueldo = entrada.nextDouble();
        if (sueldo<1000){
            newSueldo = (sueldo*0.35)+sueldo;
            System.out.println("El nuevo sueldo del trabajdor es: "+newSueldo);
        }
    }
}
