package trzecizestawzadania;

import java.util.Random;

public class Zadanie1 {

	public static void main(String[] args) 
	
	
	{
		int dlugosc=0;
		int max;
		int min;
		
		double sumaliczb=0;
		int mniejszy=0;
		int wiekszy=0;
		
		int[] tablica=new int[10];
		
		
		Random r = new Random();
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		
		
		for(int i=0 ; i<tablica.length;i++)
		{
		
		tablica[i]= r.nextInt(21)-10;
		sumaliczb=sumaliczb+tablica[i];
		 
		 System.out.print(tablica[i]+"  ");
		
		if(tablica[i]>max)
		{
			max=tablica[i];
		}
		if(tablica[i]<min)
		{
			min=tablica[i];
		}
		

	}
		
		System.out.println();
		System.out.println("max="+max);
		System.out.println("min="+min);
		double srednia= sumaliczb/tablica.length;
		System.out.println("srednia wynosi: "+ srednia);
		
		
		for(int i =0 ; i<tablica.length;i++)
		{
			if(tablica[i]>srednia)
			{
				wiekszy=wiekszy+1;
				
			}
			else if(tablica[i]<srednia)
			{
				mniejszy=mniejszy+1;
			}
		}
	 
		
		System.out.println("Mniejszych od sredniej: " + mniejszy);
		System.out.println("Wiêkszych od sredniej: "  + wiekszy);
		
		
		
			
		
		for(int i=tablica.length-1;i>=0;i--)
		{
			System.out.print(tablica[i]+"  ");
		}
}
}


