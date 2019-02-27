package Matrices;

import java.util.Scanner;

public class MatrizTraspuesta {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int matriz [][] = new int [3][3] ;
		
		System.out.println("Digite lA matriz ");
		for (int i = 0 ; i<3 ; i++) {
			
			for(int j = 0; j< 3 ; j++) {
				
				System.out.print("Matriz [" + i + "] [" + j + "]:");
				
				matriz [i] [j] = entrada.nextInt();
			}

	}
			
		System.out.println("\nMatriz original:");
		for (int i = 0 ; i<3 ; i++) {
				
				for(int j = 0; j<3 ; j++) {
					
					System.out.print(matriz [i] [j]);
				}
				
				System.out.println("");
				
		}
		
		int aux;
		
		for (int i = 0 ; i<3 ; i++) {
			
			for(int j = 0; j<i ; j++) {
				
				aux = matriz  [i] [j] ;
				matriz [i] [j] = matriz [j] [i];
				matriz [j] [i] = aux;		
			}
		
		}
		
		System.out.println("\nla matriz traspuesta es :");
		for (int i = 0 ; i<3 ; i++) {
				
				for(int j = 0; j<3 ; j++) {
					
					System.out.print(matriz [i] [j] + "");
					
		}
				
				System.out.println("");
				
				
		}
		
	}
	
}
				
				
				
				
