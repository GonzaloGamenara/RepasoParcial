import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        Experimento experimento1 = new Experimento("","");
        experimento1.setEspecie(miScanner);
        experimento1.setMedida(miScanner);

        Observación observaciónInicial = new Observación(0);
        System.out.println("Ingrese el Umbral de la Observacion inicial (ejemplo 3,2): ");
        observaciónInicial.setUmbral(miScanner);
        Observación observacionFinal = new Observación(0);
        System.out.println("Ingrese el Umbral de la Observacion final (ejemplo 3,2): ");
        observacionFinal.setUmbral(miScanner);

        observaciónInicial.tomarDatos(miScanner);
        observacionFinal.tomarDatos(miScanner);

        experimento1.informe(observaciónInicial, observacionFinal);

    }
}