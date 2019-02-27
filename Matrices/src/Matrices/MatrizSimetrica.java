package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatrizSimetrica {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		int matriz [][] , Nfilas, Ncolumnas;
		boolean SIMETRICA = true;
		
			Nfilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas:"));
			Ncolumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de colunmas :"));

			matriz = new int [Nfilas][Ncolumnas];
			
			System.out.println("Digite una matriz ");
			for (int i = 0 ; i<Nfilas ; i++) {
				
				for(int j = 0; j< Ncolumnas ; j++) {
					
					System.out.print("Matriz [" + i + "] [" + j + "]:");
					
					matriz [i] [j] = entrada.nextInt();
	}

}

			if (Nfilas == Ncolumnas) {
				
				int i , j ;
				i= 0 ;
					while (i<Nfilas && SIMETRICA ==true) {
				j =0 ;
					while (j<i && SIMETRICA ==true) {
					if ( matriz [i] [j] != matriz [j] [i] ) {
						
					SIMETRICA = false ;
					
					}
					
				j++;
					}
					
				i++;
					
			}
					
			if(SIMETRICA ==true ) {
			
				JOptionPane.showMessageDialog(null," La matriz es simetrica");
				
			}
			
			else {
				
				JOptionPane.showMessageDialog(null," La matriz no es simetrica");
			}
	}
	
			else {
				
				JOptionPane.showMessageDialog(null," La matriz no es simetrica");
			}

	
	}
	
}
	
	