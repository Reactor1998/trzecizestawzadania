package trzecizestawzadania;

import java.util.Scanner;

public class Zadanie5 {

	public static void main(String[] args)
	
	{
		int znak;
		int indeks=31;
		int liczba, kopia;
		int[] tab= new int [32];
		

		System.out.println("Podaj liczbe , któr¹ chcesz przekonwertowaæ");
		
		Scanner czytaj= new Scanner(System.in);
		
		liczba=czytaj.nextInt();
		kopia=liczba;
		
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
		System.out.print("zm:  "+znak+".");
		for(int i=indeks+1 ; i<32;i++)
		{
			System.out.print(tab[i]);
			
		}
		
		System.out.println();
		if (kopia<0)
		{
			System.out.print("zu1: "+znak+".");
			for(int i=indeks+1;i<tab.length;i++)
			{
				if(tab[i]==0)
				{
					tab[i]=1;
				}
				else
					tab[i]=0;
				System.out.print(tab[i]);
			}
			
			System.out.println();
			
			System.out.print("zu2: "+znak+".");
			
			int k=31;
			
	
		
			while(tab[k]==1) 
			{
			tab[k]=0;
				k--;		
			}
			tab[k]=1;
			
		for(int i=indeks+1;i<tab.length;i++)
			{
				System.out.print(tab[i]);
			
			}
			
		
}
			
}
}


