/******************************************************************
vista.java
Autor: Carol Arevalo y Jose Miguel Gonzalez
Última modificación: xxx

vista
******************************************************************/

import java.util.Scanner;

public class vista {
    Scanner scan = new Scanner(System.in);
      
    public vista(){
    }

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

    public void imprimir(String x){
        System.out.println(x);
    }

    public int siono(){

        System.out.println("Esta seguro que desea apagar la radio \n1: si / 2: no");

        while (true){ 
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
