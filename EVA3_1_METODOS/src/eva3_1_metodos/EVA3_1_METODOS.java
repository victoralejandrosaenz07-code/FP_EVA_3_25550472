/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author victo
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1 = 5, val2 = 10;
        //1.si necesito guardar el valor de retorno
        int resu = sumarEnteros(val1, val2);
        System.out.println("suma de 5 +  10 = " + resu);
        //2.no necesito guardar el valor, un solo uso
        System.out.println("suma de 5 + 10 =" + sumarEnteros(val1, val2));
        //3.solo necesito ejecutar el metodo, no interesa el resultado
        sumarEnteros(val1, val2);
    }
    //METODO PARA SUMAR DO NUMEROS ENTEROS
    //LLAMAR A SUS METODOS USANDO VERVOS Y ESCRITURA camelCase 
    //1.MOFODICADORES DE ACCESO; PUBLIC, PROTECTED, PRIVATE,
    //2.static ---> PAR USARLOS DENTRO DEL MAIN
    //3.valor de retorno: cualquier tipo de dato
    //  void-->SI NO QUIEREN REGRESAR UN VALOR
    //4.nombre del metodo: mismas reglas que identificadores 
    //5.lista de parametros: puede ser cero o N cantidad
    //1       2    3         4              5
    public static int sumarEnteros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
}
    
}
