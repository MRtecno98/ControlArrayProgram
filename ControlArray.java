public class ControlArray
{
	public static void main(String[]args)
	{
		
		int AR1[] = {4732,3712,4732,4572,98};
        
		
			boolean Positivo = false;
			
			System.out.println("Inizio controllo array: AR1");
			
			for (int i = 0; i < 4; i++)
			{
				System.out.println("Slot " + i + " = " + AR1[i]);
				
				if (AR1[i] == 98)
				{
					Positivo = true;
				}
				
			}
			
			if (Positivo == true)
			{
				System.out.println("L'Array AR1 è risultato positivo");	
			}
			else
			{
				System.out.println("L'Array AR1 è risultato negativo");	
			}
			
	}
}