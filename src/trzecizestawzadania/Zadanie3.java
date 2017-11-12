package trzecizestawzadania;

import java.util.Random;

public class Zadanie3 {

	public static void main(String[] args) {
		
		
		int [][] m;
		m=new int [5][5];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		
		Random r=new Random();
		
		for(int i=0; i<5;i++)
		{	
			for(int j=0;j<5;j++)
			{
			m[i][j]= r.nextInt(11)-5;
			
			if(m[i][j]<min)
			{
				min=m[i][j];
				
			}
		
			}
			System.out.println("minimalna wartosc "+i+"="+min);
			min=Integer.MAX_VALUE;
		}
		
			for(int i=0; i<5;i++)
			{	
				for(int j=0;j<5;j++)
				{
					if(m[j][i]>max)
					{
						max=m[j][i];
					}
					if(m[i][j]>=0)
					{
						System.out.print(" "+m[i][j]+"  ");	
					}
					else
					{
						System.out.print(m[i][j]+"  ");
					}
					
				}
				System.out.println("max wartosc"+max);
				max=Integer.MIN_VALUE;
				System.out.println();
				
				
	}
		
			for(int i=0;i<5;i++)
			{
				
				if(m[i][i]>max)
				{
					max=m[i][i];
				}
				
			}
			System.out.println("max przekatna: "+max);
			
			for(int i=0;i<5;i++)
			{
				if(m[i][4-i]<min)
				{
					min=m[i][4-i];
				}
					
					
						
				}
		
	System.out.println("min wartosc 2 przekatna= "+min);
			
}
}

