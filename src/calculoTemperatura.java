import  java.util.Scanner;
public class calculoTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperatura, numeroSonido;

        System.out.println("Digite cuantas beces canto el grillo: ");
        numeroSonido = entrada.nextDouble();
        temperatura = (numeroSonido/4)+40;
        System.out.println("La Temperatura es: "+temperatura);
    }
}
