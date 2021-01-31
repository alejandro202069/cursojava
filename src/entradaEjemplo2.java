import javax.swing.*;
public class entradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String Nombre=JOptionPane.showInputDialog("introduce tu nombre , por favor");
           String edad=JOptionPane.showInputDialog("introduzca la edad, por favor");
           int edadUsuario=Integer.parseInt(edad);
           edadUsuario++;
           System.out.println("hola "+ Nombre + " como estas, aunque tengas la edad de  "+edad+ "  porque el año que viene tendras "+edadUsuario);
            
	}

}
