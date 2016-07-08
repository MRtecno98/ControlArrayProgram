public class ControlArray
{
	public static void main(String[]args)
	{
		int AR1[] = {4732,3712,4732,4572,98};
		
		public static ControlArray(String NomeAR)
		{
			boolean Positivo = false;
			
			System.out.println("Inizio controllo array: " + NomeAR);
			
			for (int i = 0; i <= NomeAR.lenght; i++)
			{
				System.out.println("Slot " + i + " = " + NomeAR[i]);
				
				if (NomeAR[i] = 98)
				{
					Positivo = true;
				}
				
			}
			
			if (Positivo = true)
			{
				System.out.println("L'Array " + NomeAR + " è risultato positivo");	
			}
			 else
			 {
				System.out.println("L'Array " + NomeAR + " è risultato negativo");	
			 }
			
			
		}
		
		
	}
}