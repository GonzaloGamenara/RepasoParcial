import  java.util.Scanner;

public class Observación {
    private double umbral;
    private int cantidad;
    private double maximo;
    private double minimo;
    private double promedio;

    public Observación(double umbral){
        this.umbral = umbral;
    }

    public double getPromedio(){
        return this.promedio/this.cantidad;
    }

    public double getMaximo() {
        return maximo;
    }

    public double getMinimo() {
        return minimo;
    }

    public double getUmbral(){
        return this.umbral;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setUmbral(Scanner miScanner) {
        this.umbral = miScanner.nextDouble();
    }

    public void tomarDatos(Scanner miScan){
        System.out.println("Ingrese los datos uno tras otro, para terminar ingrese un valor negativo...");
        double dato = miScan.nextDouble();
        this.minimo = dato;
        this.maximo = dato;
        while(dato >= 0){
            if (dato <= this.umbral){
                this.cantidad ++;
                if(dato > this.maximo){
                    this.maximo = dato;
                    this.promedio += dato;
                }
                if(this.minimo > dato){
                    this.minimo = dato;
                    this.promedio += dato;
                }
            }else{
                System.out.println("El dato esta fuera del umbral...");
            }
            dato = miScan.nextDouble();
        }
        System.out.println("Ingreso de datos terminado...");
        System.out.println();

    }
}
