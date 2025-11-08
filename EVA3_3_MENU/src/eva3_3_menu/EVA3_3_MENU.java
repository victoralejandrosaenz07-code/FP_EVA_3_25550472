/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA3_3_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
        int opción;
        do{
        imprimirMenu();
        opción = captu.nextInt();
        if(opción==1 ){
            calcularPotencia();
        }else if(opción == 2 ){
         sumarNúmeros();
        }
        }while(opción !=3);
     
    }
     public static void imprimirMenu(){
         System.out.println("Bienvenido");
         System.out.println("1. Calcula una potencia");
         System.out.println("2. Sumar los numeros");
         System.out.println("3.Salir del sistema");
         System.out.println("Selecciona una opción ");
     }
        public static void calcularPotencia(){
        Scanner captu = new Scanner(System.in);
        int base, exp;
            System.out.println("-----Cálculo de una potencia-----");
            System.out.println("La base:");
            base = captu.nextInt();
            System.out.println("El exponente:");
            exp = captu.nextInt();
            System.out.println(base + "elevado a " + exp +" = " + calcularPot(base, exp) );
            
        }
        public static int calcularPot(int base, int exp){
            int resu = 1;
            for (int i = 0; i <= exp; i++) {
                resu = resu * base;
                
            }
            return resu;
            
        }
        public static void sumarNúmeros(){
        Scanner captu = new Scanner(System.in);
        int num1, num2;
            System.out.println("-----Suma de dos números-----");
            System.out.println("Número 1:");
            num1 = captu.nextInt();
            System.out.println("Número 2:");
            num2 = captu.nextInt();
            System.out.println(num1 + " + " +  num2 + " es = " + sumaNum(num1, num2));
            
        }
       public static int sumaNum( int num1, int num2){
           int resu;
           resu = num1 + num2;
           return resu;
       }
        
}
