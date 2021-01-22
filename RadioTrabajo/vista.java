/******************************************************************
@author Carol Arevalo y Jose Miguel Gonzalez
ultima modificacion: 21/01/21

vista
******************************************************************/

import java.util.Scanner;
/** 
 * Nos sirve para interactuar con el usuario.
 */
public class vista {
    Scanner scan = new Scanner(System.in);
      
    public vista(){
    }

    
    /** 
     * @return int
     * @param none
     * Informacion del menu y solicita informacion
     */
    public int menu(){

    System.out.println("\n\n-----------.M.E.N.U.-----------");
    System.out.println("1.Encender/Apagar Radio ");//NO SE SI JALA
    System.out.println("2.Cambiar FM/AM ");//NO SE SI JALA
    System.out.println("3.Guardar emisora ");//NO SE SI JALA
    System.out.println("4.Seleccionar boton ");//NO SE SI JALA
    System.out.println("5.Avanzar de estaciones"); //NO SE SI JALA
    System.out.println("6.Salir\n\n");//NO SE SI JALA
    
    while (true) { 
        try { 
        int op = scan.nextInt();
        if (op>0 & op <7){
            return op;
        } else {
            throw new StringIndexOutOfBoundsException();
        }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nERROR: La opción singresada no es válida, ingrese un número en el rango de opciones");
        }
    }

    }

    
    /** 
     * @return int
     * @param none
     * @Informacion oara escoger entre am y fm
     */
    public int AmFm(){

    System.out.println("\n\nElija una opcion:");
    System.out.println("1.AM");//NO SE SI JALA
    System.out.println("2.FM");//NO SE SI JALA

    while (true) { 
        try { 
        int op = scan.nextInt();
        if (op>0 & op <3){
            return op;
        } else {
            throw new StringIndexOutOfBoundsException();
        }
        } catch (StringIndexOutOfBoundsException e) {
        System.out.println("\nERROR: La opción singresada no es válida, ingrese un número en el rango de opciones");
        }
    }

    }

    
    /** 
     * @param x
     * @
     * @Para imprimir lo que nos sea util a lo largo del main
     */
    public void imprimir(String x){
        /** 
        * 
        */
        System.out.println(x);
    }
    
    /** 
     * @return int
     * @param none
     * @Se pide un numero del 1 al 12 para que el usuario escoga en donde guardar su emisora, ademas de asegurarse que no igrese valores no validos
     */
    public int gboton(){

        System.out.println("Escoga un numero del 1 al 12 para guardar la emisora (tenga en cuenta se sobre escribira si habia una antes)");

        while (true){ 
            try {
            int op = scan.nextInt();
            if (op>0 & op <13){
                return op;
            } else {
                throw new StringIndexOutOfBoundsException();
            }
            } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nERROR: La opción singresada no es válida, ingrese un número en el rango de opciones");
            }
        }

    }
    
    /** 
     * @return int
     * @param none
     * @Solicita al usuario un boton del 1 al 12 para ser usado en el main, ademas de asegurarse que no ingrese valores erroneos.
     */
    public int eboton(){

        System.out.println("Escoga un boton");

        while (true){ 
            try {
            int op = scan.nextInt();
            if (op>0 & op <13){
                return op;
            } else {
                throw new StringIndexOutOfBoundsException();
            }
            } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nERROR: La opción singresada no es válida, ingrese un número en el rango de opciones");
            }
        }

    }
}
