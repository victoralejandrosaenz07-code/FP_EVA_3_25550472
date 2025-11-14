/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_areas;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class EVA3_9_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenu();
            opcion = captu.nextInt();

            if (opcion == 1) {
                calcularCirculo();
            } else if (opcion == 2) {
                calcularRectangulo();
            } else if (opcion == 3) {
                calcularTrapecio();
            }

        } while (opcion != 4);

        System.out.println("Saliendo del sistema...");
    }

    public static void imprimirMenu() {
        System.out.println("Bienvenido");
        System.out.println("1. Calcular área de un Círculo");
        System.out.println("2. Calcular área de un Rectángulo");
        System.out.println("3. Calcular área de un Trapecio");
        System.out.println("4. Salir del sistema");
        System.out.print("Selecciona una opción: ");
    }

    public static void calcularCirculo() {
        Scanner captu = new Scanner(System.in);
        double radio;

        System.out.println("---------------Cálculo del área de un Círculo---------------");
        System.out.print("coloca el radio: ");
        radio = captu.nextDouble();

        System.out.println("Área = " + calcularArea(radio));

        captu.nextLine();  // limpiar buffer
        pausa();
    }

    public static void calcularRectangulo() {
        Scanner captu = new Scanner(System.in);
        double base, altura;

        System.out.println("---------Cálculo del área de un Rectángulo---------");
        System.out.print("pon la base: ");
        base = captu.nextDouble();

        System.out.print("pon la altura: ");
        altura = captu.nextDouble();

        System.out.println("Área = " + calcularArea(base, altura));

        captu.nextLine();
        pausa();
    }

    public static void calcularTrapecio() {
        Scanner captu = new Scanner(System.in);
        double bMayor, bMenor, altura;

        System.out.println("--------------------Cálculo del área de un Trapecio------------------");
        System.out.print("pon la base mayor: ");
        bMayor = captu.nextDouble();

        System.out.print("pon la base menor: ");
        bMenor = captu.nextDouble();

        System.out.print("pon la altura: ");
        altura = captu.nextDouble();

        System.out.println("Área = " + calcularArea(bMayor, bMenor, altura));

        captu.nextLine();
        pausa();
    }

    public static double calcularArea(double radio) {
        return Math.PI * (radio * radio);
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularArea(double baseMayor, double baseMenor, double altura) {
        return (baseMayor + baseMenor) * altura / 2;
    }

    public static void pausa() {
        Scanner pausa = new Scanner(System.in);
        System.out.println("\nPresiona ENTER para continuar...");
        pausa.nextLine();
    }
}


    

