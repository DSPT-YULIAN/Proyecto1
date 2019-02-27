package Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IngresandoData {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	int matriz [][] , Nfilas, Ncolumnas;
		
		Nfilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas:"));
		Ncolumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de colunmas :"));
		
		matriz = new int [Nfilas][Ncolumnas];
		
		System.out.println("Digite la matriz ");
		for (int i = 0 ; i<Nfilas ; i++) {
			
			for(int j = 0; j< Ncolumnas ; j++) {
				
				System.out.print("Matriz [" + i + "] [" + j + "]:");
				
				matriz [i] [j] = entrada.nextInt();
				
			}
			
		}

	System.out.println("\nLa matriz es: ");
	for (int i = 0 ; i<Nfilas ; i++) {
			
			for(int j = 0; j<Ncolumnas ; j++) {
				
				System.out.print(matriz [i] [j]);
		
	}

			System.out.println();
			
}

	}

}
