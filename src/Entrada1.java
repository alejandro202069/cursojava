import java.util.*;
public class Entrada1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner entrada=new Scanner(System.in);
       System.out.println("introduzca el nombre");
       String nombre =entrada.nextLine();
       System.out.println("introduzca su edad, por favor");
       int edad=entrada.nextInt();
       System.out.println("Hola "+nombre+" el año que viene tendras "+ (edad+1 ) + " años");
       
       
       
	}
}
