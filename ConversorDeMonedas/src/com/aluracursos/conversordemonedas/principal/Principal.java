package com.aluracursos.conversordemonedas.principal;

import com.aluracursos.conversordemonedas.calculo.CalcularTipoCambio;
import com.aluracursos.conversordemonedas.modelo.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        CalcularTipoCambio calcularTipoCambio = new CalcularTipoCambio();
        int opcionMenu;
        double valor;
        String opcionCambio;

        do {
            System.out.println("*****************************************");
            System.out.println(" Sea bienvenido/a al Conversor de Moneda");
            System.out.println("*****************************************\n");
            System.out.println("1) Dólar =>>> Peso argentino\n");
            System.out.println("2) Peso argentino =>>> Dólar\n");
            System.out.println("3) Dólar =>>> Real brasileño\n");
            System.out.println("4) Real brasileño =>>> Dólar\n");
            System.out.println("5) Dólar =>>> Peso colombiano\n");
            System.out.println("6) Peso colombiano =>>> Dólar\n");
            System.out.println("7) Salir\n");
            System.out.println("Digite una opción valida: ");
            opcionMenu = lectura.nextInt();

            System.out.println("\nIngrese el valor que desea convertir: ");

            switch (opcionMenu){
                case 1:
                    valor = lectura.nextDouble();
                    opcionCambio = "USD/ARS";
                    Moneda moneda1 = calcularTipoCambio.convertirMoneda(opcionCambio, valor);
                    System.out.println("El valor " + valor + " [USD] corresponde al valor final de =>>> " + moneda1.conversion_result() + " [ARS]\n");
                    break;
                case 2:
                    valor = lectura.nextDouble();
                    opcionCambio = "ARS/USD";
                    Moneda moneda2 = calcularTipoCambio.convertirMoneda(opcionCambio, valor);
                    System.out.println("El valor " + valor + " [ARS] corresponde al valor final de =>>> " + moneda2.conversion_result() + " [USD]\n");
                    break;
                case 3:
                    valor = lectura.nextDouble();
                    opcionCambio = "USD/BRL";
                    Moneda moneda3 = calcularTipoCambio.convertirMoneda(opcionCambio, valor);
                    System.out.println("El valor " + valor + " [USD] corresponde al valor final de =>>> " + moneda3.conversion_result() + " [BRL]\n");
                    break;
                case 4:
                    valor = lectura.nextDouble();
                    opcionCambio = "BRL/USD";
                    Moneda moneda4 = calcularTipoCambio.convertirMoneda(opcionCambio, valor);
                    System.out.println("El valor " + valor + " [BRL] corresponde al valor final de =>>> " + moneda4.conversion_result() + " [USD]\n");
                    break;
                case 5:
                    valor = lectura.nextDouble();
                    opcionCambio = "USD/COP";
                    Moneda moneda5 = calcularTipoCambio.convertirMoneda(opcionCambio, valor);
                    System.out.println("El valor " + valor + " [USD] corresponde al valor final de =>>> " + moneda5.conversion_result() + " [COP]\n");
                    break;
                case 6:
                    valor = lectura.nextDouble();
                    opcionCambio = "COP/USD";
                    Moneda moneda6 = calcularTipoCambio.convertirMoneda(opcionCambio, valor);
                    System.out.println("El valor " + valor + " [COP] corresponde al valor final de =>>> " + moneda6.conversion_result() + " [USD]\n");
                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor de monedas.");
                    break;
                default:
                    System.out.println("\nDigite una opción valida por favor");
            }
        }while (opcionMenu !=7);
    }
}
