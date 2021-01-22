/******************************************************************
@author Carol Arevalo y Jose Miguel Gonzalez
ultima modificacion: 21/01/21

main(controlador)
******************************************************************/

/**
*
*funcionamiento de un radio
*/

public class Main {


    public static void main (String [] args){

        //variables
        int op= -1;
        boolean taencendido = true;

        //INSTANCIAS
        vista v= new vista();
        Radio r= new Radio();
        
        while ( op != 6 ){ 
            
            op=v.menu();
            
            /****************************************************************************************/
            if (op == 1) {

                taencendido = r.encenderApagar();

                
            /****************************************************************************************/
            } else if(op == 2 && taencendido == true){

                boolean af= r.amFm();

                if(af == false){
                    v.imprimir("Esta en Fm.");
                }else if(af == true){
                    v.imprimir("Estas en Am.");
                }
            
            /****************************************************************************************/
            } else if(op == 3 && taencendido == true){

                int btn=v.gboton();
                String guardado= r.guardar(btn);

                v.imprimir("Se ha guardado la estacion " + guardado +" en el boton " + btn + "");

            /****************************************************************************************/    
            } else if(op == 4 && taencendido == true){
                int btn=v.eboton();
                String estacion = r.seleccionar(btn);
                v.imprimir(estacion);
                


            /****************************************************************************************/    
            } else if(op == 5 && taencendido == true){
                
                double estacion = r.avanzar();
                String amfm = "";

                if(estacion<530 && estacion>1610){
                    amfm = "FM";
                }
                
                else if(estacion<87.9 && estacion>107.9){
                    amfm = "AM";
                }
                
                v.imprimir("Avanzaste a la estacion: " + estacion + " " + amfm+" ^-^");

            /****************************************************************************************/    
            } else if(op == 6 && taencendido == true){

                System.out.println("Adios UwU");
                taencendido=false;

            }
        }

    }

}
