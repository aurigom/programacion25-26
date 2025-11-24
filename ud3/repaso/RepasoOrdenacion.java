package Repaso;

import java.util.Arrays;

public class RepasoOrdenacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []burbujas= {6,5,3,2,1};
		boolean intercambio=false;
		System.out.println(Arrays.toString(burbujas));
		do {
			intercambio=false;
			for (int i = 0; i < burbujas.length-1; i++) {
				
				if (burbujas[i]>burbujas[i+1]) {
					int temp= burbujas[i];
					burbujas[i]=burbujas[i+1];
					burbujas[i+1]=temp;
					intercambio=true;
					
				}
				
		
				
			}
		
		} while (intercambio);
		
		for (int i = 0; i < burbujas.length; i++) {
			System.out.print(burbujas[i]);
		}
		
		System.out.println(Arrays.toString(burbujas));
		
	}

}
