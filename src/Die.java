import java.util.Random;

public class Die 
{
	
	private int value;
    
	
     public Die()
     {
         
     }
     
     public int roll()
     {
    	 Random rand = new Random();
    	 int i = rand.nextInt(6) + 1;
    	 return i; 
     }
     
	public int getValue()
	{
		return value;
	    
	}

	
     
}
