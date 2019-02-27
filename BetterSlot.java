import java.util.Arrays;
import java.util.Random;

public class BetterSlot
{
	
	public int[] pullTheLever() 
	{
		int[] n = new int[5];
		Random random = new Random();
		
		for(int i = 0; i < n.length; i++) 
		{
			int rand = random.nextInt(50);
			rand += 1;
			n[i] = rand;
		}
		
		payOff(n);
		
		return n;
	}
	
	public int payOff(int[] m) 
	{
		//Passed In Array (m) Equal to Global Array (n)
		Arrays.sort(m);
		
		int one = m[0];
		int two = m[1];
		int three = m[2];
		int four = m[3];
		int five = m[4];
		
		int prize = 0;
		
		//All five values of SORTED ARRAY (m) match 
		if(one == five) 
		{
			prize += 1000000;
		}
		
		//Four values of array m match
		else if(one == four || two == five) 
		{
			prize += 10000;
		}
		
		//Check For Three Matches ***(DuoFold)***
		else if (one == three || two == four || three == five) 
		{
			//First Case : Full House - Three Match 2 Others Match
			if( ((one == three) && (four == five)) || ((three == five) && (one == two))) 
			{
				prize += 5000;
			}
			
			//Second Case : Only Three Match
			else
			{
				prize += 100;
			}
		}
		
		//Two Match
		else if ((one == two) || (two == three) || (three == four) || (four == five)) 
		{
			prize += 10;
		}
			
		//Bonus Prizes No Matches ***
		//Perfect Square
		boolean bonus_earned_perfectsqr = false;
		for (int i = 0; i < m.length; i++) 
		{
			if((m[i] == 1) || (m[i] == 4) || (m[i] == 9) ||
					(m[i] == 16) || (m[i] == 25) || (m[i] == 36) || (m[i] == 49)) 
			{
				bonus_earned_perfectsqr = true;
			}
			
		}
		
		if (bonus_earned_perfectsqr == true) 
		{
			prize += 7;
			
		}
		
		//Lucky Number is 42
		boolean bonus_earned_lucky = false;
		for (int i = 0; i < m.length; i++) 
		{
			if((m[i] == 42)) 
			{ 
				bonus_earned_lucky = true;
			}
		}
			
		if (bonus_earned_lucky == true) {prize += 2;}
		
		//Power of Two
		boolean bonus_earned_pwr = false;
		
		for (int i = 0; i < m.length; i++) 
		{	
			if((m[i] == 1) || (m[i] == 2) || (m[i] == 4) ||
					(m[i] == 8) || (m[i] == 16) || (m[i] == 32)) 
				{ 
					bonus_earned_pwr = true;
				}
		}
			
		if(bonus_earned_pwr == true) {prize += 3;}
		
		return prize;
	}
	
}

