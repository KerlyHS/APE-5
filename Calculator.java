
package com.mycompany.calculator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Calculator {

        public static void main(String[] args) {
            Operation poo = new Operation();
            Scanner entrada = new Scanner(System.in);
            int n1, n2, opcion;
            int respuesta;
            boolean op = true;
            while (op){

            System.out.println("************************************************************");
            System.out.println("*********************   CALCULADORA   **********************");
            System.out.println("************************************************************");
            System.out.println("ELABORADO: GRUPO 4");
            System.out.println("************************************************************");
            System.out.println("************************ MENU ******************************");
            System.out.println("1 (SUMA)");
            System.out.println("2 (SALIR)");
            System.out.println("************************************************************");
            System.out.println("SELECCIONE EL NUMERO DE LA OPERACION QUE DESEA REALIZAR O SI DESEA SALIR: ");
            System.out.println("************************************************************");
            opcion = entrada.nextInt();
        
            if(opcion == 2){
                System.out.println("GRACIAS POR USAR LA CALCULADORA. VUELVA PRONTO...");
                break;
            }
            else {
                switch(opcion){
                case 1:
                    System.out.println("ELIGIO SUMA");
                    System.out.println("INGRESAR PRIMER NUMERO: ");
                    n1 = entrada.nextInt();
                    System.out.println("INGRESAR SEGUNDO NUMERO: ");
                    n2 = entrada.nextInt();
                    respuesta = poo.sumar(n1, n2);
                    System.out.println("LA RESPUESTA ES: " + respuesta);
                    break;
                
                default:
                    System.out.println("OPCION INVALIDA...");
                }   
            }
        }
    }  
}
