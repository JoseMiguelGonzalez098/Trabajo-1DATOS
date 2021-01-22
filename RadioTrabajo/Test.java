import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void testEncenderApagar() {
		Radio radio= new Radio();
		boolean sal = radio.encenderApagar();
        assertEquals(false, sal);
		
	}
	@org.junit.Test
	public void testAmFm() {
		
		Radio radio= new Radio();
		boolean sal = radio.amFm();
        assertEquals(true, sal);
		
	}
	@org.junit.Test
	public void testAvanzar() {
		
		Radio radio= new Radio();
		double sal = radio.avanzar();
		int a = (int)sal;
		boolean respuesta = false;
		
		if(radio.amFm == true){ //si esta en am//530 - 1610

			if(a > 529 && a < 1611) {
				respuesta = true;
			}
			
			assertEquals(true, respuesta);
			
	    }else if(radio.amFm == false){ //si esta en fm//87.9 - 107.9
	        
	    	if(a > 87 && a < 109) {
				respuesta = true;
			}
			
			assertEquals(true, respuesta);
	    }
		
        
		
	}

}
