import java.util.Scanner;

public class Experimento {
    private String medida;
    private String especie;
    private Observación observaciónInicial;
    private Observación observaciónFinal;

    public Experimento(String medida, String especie){
        this.medida = medida;
        this.especie = especie;
    }

    public void setEspecie(Scanner miScanner) {
        System.out.println("Ingrese el especie a analizar: ");
        this.especie = miScanner.nextLine();
    }

    public void setMedida(Scanner miScanner) {
        System.out.println("Ingrese la medida a analizar: ");
        this.medida = miScanner.nextLine();
    }

    public String getEspecie() {
        return this.especie;
    }

    public String getMedida() {
        return this.medida;
    }

    public void informe(Observación obsInicial, Observación obsFinal){
        System.out.println("Informe del experimento");
        System.out.println("Datos de la observacion inicial:");
        System.out.println("Umbral utilizado: " + obsInicial.getUmbral());
        System.out.println("Cantidad: " + obsInicial.getCantidad());
        System.out.println("Maximo: " + obsInicial.getMaximo());
        System.out.println("Minimo: " + obsInicial.getMinimo());
        System.out.println("Promedio: " + obsInicial.getPromedio());
        System.out.println();
        System.out.println("Datos de la observacion final:");
        System.out.println("Umbral utilizado: " + obsFinal.getUmbral());
        System.out.println("Cantidad: " + obsFinal.getCantidad());
        System.out.println("Maximo: " + obsFinal.getMaximo());
        System.out.println("Minimo: " + obsFinal.getMinimo());
        System.out.println("Promedio: " + obsFinal.getPromedio());
        System.out.println();

        if(obsFinal.getMaximo() < obsInicial.getMaximo() && obsFinal.getCantidad() + obsInicial.getCantidad() > 6){
            System.out.println("La especie: "+ this.especie + " presenta problemas");
        }
    }
}
