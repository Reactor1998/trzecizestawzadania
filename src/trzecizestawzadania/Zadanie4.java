package trzecizestawzadania;

import java.util.Scanner;

public class Zadanie4 {

	public static void main(String[] args)
	
	{
		int znak;
		int indeks=31;
		int liczba;
		int[] tab= new int [32];
		

		System.out.println("Podaj liczbe , któr¹ chcesz przekonwertowaæ");
		
		Scanner czytaj= new Scanner(System.in);
		
		liczba=czytaj.nextInt();
		
		if(liczba>=0)
		{
			znak=0;
		}
		else
		{
			znak=1;
			liczba=liczba*-1;
		}
		
		while(liczba>0)
		{
			tab[indeks]=liczba%2;
			liczba=liczba/2;
			indeks--;
			
		}
		System.out.print(znak+".");
		for(int i=indeks+1 ; i<32;i++)
		{
			System.out.print(tab[i]);
			
		}
		
		
	}

}
