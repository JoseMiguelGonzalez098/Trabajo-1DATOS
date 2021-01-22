/******************************************************************
@author Carol Arevalo y Jose Miguel Gonzalez
ultima modificacion:21/01/21

radio
******************************************************************/
import java.util.Scanner;


/**
*Implementa interface
*funcionamiento de un radio
*/

public class Radio implements Interface{

    public boolean encendido =true; 
    public boolean amFm = false;
    public String guardar;
    public String seleccionar;
    public double avanzar = 94.9;
    public String[] botones= {null, null, null, null, null, null, null, null, null, null, null, null};
   
   /** 
    * constructor 
    * 
    */
   public Radio(){
   }
    
   //METODOS--------------------------------------------------------------------------------------


   /** 
     * @return boolean
     * @param none
     * Cambia el estado de "encendido" de la Radio
     */

   public boolean encenderApagar(){
    //encendido = false;

    if(encendido == true){

        encendido = false;

    } else if(encendido == false){

        encendido = true;

    }
    return encendido; 
   }
    

/***************************************************************************************/
/** 
     * @return boolean
     * @param none
     * Cambia la frecuencia en la que se encuentra la Radio, con un true o un false, y cambia el numero de la emisora en la que se encuentra
     */
public boolean amFm(){

    if(amFm == false){
        amFm = true;
        avanzar = 530.0;
    }else if(amFm == true){
        amFm = false;
        avanzar = 87.9;
    }
    return amFm; 
}
/***************************************************************************************/
/** 
     * @return String
     * @param int
     * Remplaza el valor de una lista en la que se encuntran las frecuencias guardadas
     */
    
public String guardar(int btn){

    String estacion = avanzar + "";
    String x=""; 

    if(amFm == false){
        x = "FM";
    }else if(amFm == true){
        x = "AM";
    }

    String guarda = estacion + " " + x;
    botones[btn] = guarda;

    return guardar;
}

/***************************************************************************************/
/** 
     * @return String
     * @param int
     * Permite al usuario cambiar a una de las radios que tenga guardadas, cambiando la frencencia y la radio.
     */
public String seleccionar(int btn){

    String seleccionar = "";
    
    if(botones[btn] != null){
        seleccionar = "Esta es la estacion: " + botones[btn];
        String temp = botones[btn]; //

        //Separar datos del Str
        Scanner s = new Scanner(temp).useDelimiter(" ");
        avanzar=s.nextDouble();
        String af=s.next();

        if(af.equals("AM")){
            amFm=true;

        }else if(af.equals("FM")){
            amFm=false;
        }
    }else if (botones[btn] == null){
        seleccionar = "No hay una emisora aqui *interferencia*";
    }

    return seleccionar; 
}

/***************************************************************************************/

/** 
 * @return double
 * @param none
 * Avanza entre etaciones 
 */
public double avanzar(){

    double respuesta = avanzar;
        
    if(amFm == true){ //si esta en am//530 - 1610

        respuesta = avanzar; 
        if(respuesta >= 530){
        double i = 10.0;
        respuesta = respuesta + i;
        }else if(respuesta >= 1610){
            respuesta = 530.0;
        }
        
    }else if(amFm == false){ //si esta en fm//87.9 - 107.9
        
        respuesta = avanzar;
        if(respuesta >= 87.9){
            double i= 0.2;
            respuesta = respuesta + i;
        }else if(respuesta >= 107.9){
            respuesta = 87.9;
        }
        

    }
    
    avanzar = respuesta;
    return avanzar;

}

    
}