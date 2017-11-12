package trzecizestawzadania;

import java.util.Scanner;

public class Zadanie6 
{

	public static void main(String[] args)
	{
	int liczba;
	
	System.out.print("Podaj liczbe");

	Scanner czytaj = new Scanner(System.in);
	liczba=czytaj.nextInt();
	
	boolean[][] tab= new boolean[liczba][liczba]; 
	
	for(int i=0; i<liczba; i++)
	{
		for(int j=0; j<liczba; j++)
		{
			if(wzgledniePierwsze(i+1, j+1))
			{
				tab[i][j] = true;
				System.out.print("+ ");
			}
			else
			{
				tab[i][j] = false;
				System.out.print(". ");
			}
		}
		System.out.println();
	}
	
	
}
	
	private static boolean wzgledniePierwsze(int liczba1, int liczba2)
	{
		if(liczba1>liczba2)
		{
			for(int i=liczba2; i>1; i--)
			{
				if(liczba1%i==0 && liczba2%i==0)
				{
					return false;
				}
			}
			return true;
		}
		else if(liczba1<liczba2)
		{
			for(int i=liczba1; i>1; i--)
			{
				if(liczba2%i==0 && liczba1%i==0)
				{
					return false;
				}
			}
			return true;
		}
		else if(liczba1 == 1 && liczba2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}