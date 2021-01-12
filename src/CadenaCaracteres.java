
public class CadenaCaracteres {

	public static void main(String[] args) {
		
		String nombre1="alejandro";
		System.out.println("mi nombre es " +nombre1);
		
		// length medir cadena
		String nombre2="alejandro";
		System.out.println("mi nombre tiene "+nombre2.length()+ " letras");
		
		// primera letra
		
		String nombre3="virgilio engaño";
		System.out.println("la primera letra de "+ nombre3 +" es la letra "+nombre3.charAt(0));
		
		
		// ultima letra
        int ultima_letra;
        
		String nombre4="alejandro";
		ultima_letra=nombre4.length();
		System.out.println("la ultima letra de mi nombre "+nombre4+" es la  "+nombre4.charAt(ultima_letra-1));
		
	}

}
