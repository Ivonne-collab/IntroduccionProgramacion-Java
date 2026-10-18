package tarea1;

import java.util.Scanner;
public class ConsumoEnergeticoTelevisor {
    public static void main(String[] args) {
        //Declaración de variables
        double voltaje;
        double corriente;
        double horasconsumo;
        double potencia;
        double consumo;
        //Declaración de la Constante
        final int KILOW = 1000;

            //Ingreso de voltaje, corriente y horas de consumo desde el teclado
            Scanner datos = new Scanner(System.in);

            System.out.print("Ingrese el voltaje (V): ");
            voltaje = datos.nextDouble();
            System.out.print("Ingrese la corrente (A): ");
            corriente = datos.nextDouble();
            System.out.print("Ingrese las horas de consumo (h): ");
            horasconsumo = datos.nextDouble();

            //Cálculo de Potencia y Consumo
            potencia = voltaje * corriente;
            consumo = (potencia * horasconsumo) / KILOW;

            System.out.println("El consumo energético del televisor en un día es: " + consumo + "kWh");


    }
}
