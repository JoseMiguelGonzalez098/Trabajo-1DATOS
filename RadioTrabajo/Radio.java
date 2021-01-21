/******************************************************************
radio.java
Autor: Carol Arevalo y Jose Miguel Gonzalez
Última modificación: xxx

main (controlador)
******************************************************************/
import java.util.Scanner;

class Radio implements Interface{

    public boolean encendido =true; 
    public boolean amFm = false;
    public String guardar;
    public String seleccionar;
    public double avanzar = 94.9;
    public String[] botones= {null, null, null, null, null, null, null, null, null, null, null, null};
   
   //Constructor
   public radio(){
   }

   //METODOS
   public boolean encenderApagar(){
    encendido = false;
    return encendido; 
   }
    

/***************************************************************************************/
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