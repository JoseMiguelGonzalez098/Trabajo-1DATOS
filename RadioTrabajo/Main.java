public class Main {
    
    
    public static void main (String [] args){

        //variables
        int op= -1;

        //INSTANCIAS
        vista v= new vista();
        Radio r= new Radio();

        boolean taencendido = true;
        
        while ( taencendido == true ){ 
            
            op=v.menu();
            
            /****************************************************************************************/
            if (op == 1) {

                int elec= v.siono(); 
                
                if(elec == 1){
                    taencendido = r.encenderApagar();
                } else if(elec == 2){
                    v.imprimir("Esta bien crack no me apago");
                }
                
            /****************************************************************************************/
            } else if(op == 2){

                boolean af= r.amFm();

                if(af == false){
                    v.imprimir("Esta en Fm.");
                }else if(af == true){
                    v.imprimir("Estas en Am.");
                }
            
            /****************************************************************************************/
            } else if(op == 3){

                int btn=v.gboton();
                String guardado= r.guardar(btn);

                v.imprimir("Se ha guardado la estacion " + guardado +" en el boton " + btn + "");

            /****************************************************************************************/    
            } else if(op == 4){
                int btn=v.eboton();
                String estacion = r.seleccionar(btn);
                v.imprimir(estacion);
                


            /****************************************************************************************/    
            } else if(op == 5){
                
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
            } else if(op == 6){

                System.out.println("Adios UwU");
                taencendido=false;

            }
        }

    }

}
