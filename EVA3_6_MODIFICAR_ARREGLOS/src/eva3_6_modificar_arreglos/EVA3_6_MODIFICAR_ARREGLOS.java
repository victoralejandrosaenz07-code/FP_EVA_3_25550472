/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_modificar_arreglos;

/**
 *
 * @author victo
 */
public class EVA3_6_MODIFICAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo1[] = new int [10];
        int arreglo2[] = new int [20];
        llenarArreglos(arreglo1);
        imprimirArreglos(arreglo1);
        llenarArreglos(arreglo2);
        imprimirArreglos(arreglo2);
    }
    public static void llenarArreglos(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
            
        }
    }
    public static void imprimirArreglos(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("{" + arreglo[i] + "}" );
        }
        System.out.println("");
    }
}
