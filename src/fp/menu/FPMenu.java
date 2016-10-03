/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class FPMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menu en consola JAVA
        
        System.out.println("La opcion elegida es:" + menu());
        
    }
    
    public static int menu (){
        int opcion;
        do{
        Scanner entrada = new Scanner (System.in);
        System.out.println("**** Cálculo de Areas ****");
        System.out.println(" **** Menú: ****");
        System.out.println("Introduzca la opcion deseada");
        System.out.println("1.- Area de cuadrados");
        System.out.println("2.- Area de circulos");
        System.out.println("3.- Area de triangulos");
        System.out.println("0.- Salir");
        opcion = entrada.nextInt();
        
        }while (opcion<0 || opcion>3);
        return opcion;
    }
    
    public static double calcularAreas (int op){
        double area;
        switch (op){
            case 1:
                area = areaCuadrado();
                break;
            case 2:
                area = areaCirculo();
                break;
            case 3:
                area = areaTriangulo();
                break;
            default:
                area = mensajeSalida();
                
        }
        return area;
    }
}

