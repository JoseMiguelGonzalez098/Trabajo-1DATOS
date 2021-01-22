/******************************************************************
@author Carol Arevalo y Jose Miguel Gonzalez
ultima modificacion: 21/01/21

interfaz
******************************************************************/

/**
*Nos da los parametros para poder usarlos de forma correcta el la clase de "Radio" con sus parametros y retornos.
*Interfaz que sera implementa en Radio- contrato
*/

public interface Interface{
    public boolean encenderApagar();
    public boolean amFm(); //true= am; false=fm
    public String guardar(int btn); //solicita el boton donde gurdar la emisora
    public String seleccionar(int btn); //avanzar en la emisora
    public double avanzar(); //avazar en emisorta 
}
