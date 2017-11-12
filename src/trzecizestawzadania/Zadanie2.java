package trzecizestawzadania;

import java.util.Random;

public class Zadanie2 {

	public static void main(String[] args) 
	
	{
		
	
		int [] tablica;
		int[] pomocnicza;
		
		tablica=new int [20];
		pomocnicza=new int [20];
		
		Random r=new Random();
		
		for(int i=0; i<tablica.length;i++)
		{
			tablica[i]= r.nextInt(11);
			System.out.print(tablica[i]+"  ");
		}
		
		
		System.out.println();
		
		for(int i=0;i<tablica.length;i++)
			
			{
		pomocnicza[tablica[i]]=pomocnicza[tablica[i]]+1;
			}
		
		
		for(int i =0;i<pomocnicza.length ;i++)
		{
			System.out.print(pomocnicza[i]+"  ");
		}
		
		System.out.println();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" - "+pomocnicza[i]);
		}
}
}

