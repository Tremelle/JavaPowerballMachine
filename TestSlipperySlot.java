import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;



public class TestSlipperySlot
{
    private SlipperySlot testSlot = new SlipperySlot();
    
    //Tests Single Case - Five Match
    @Test
    public void single_fiveMatch() 
    {
        int[] tester = new int [] {7,7,7,7,7};
        assertEquals(1000000, testSlot.payOff(tester));
    }
    
    //Tests Single Case - Four Match
    @Test
    public void single_fourMatch() 
    {
        int[] tester = new int [] {7,7,7,7,3};
        assertEquals(10000, testSlot.payOff(tester));
    }
    
    //Tests Single Case - Three Match and Two Match Full House
    @Test
    public void single_fullHouse() 
    {
        int[] tester = new int [] {3,3,3,5,7};
        assertEquals(5000, testSlot.payOff(tester));
    }
    
    //Tests Single Case - Three Match 
    @Test
    public void single_threeMatch() 
    {
        int[] tester = new int [] {3,3,3,5,7};
        assertEquals(100, testSlot.payOff(tester));
    }
    
    //Tests Single Case - Two Match 
    @Test
    public void single_twoMatch() 
    {
        int[] tester = new int [] {3,5,7,5,11};
        assertEquals(10, testSlot.payOff(tester));
    }
    
    //Tests Single Case - Pefect Square 
    @Test
    public void single_perfectSquare() 
    {
        int[] tester = new int [] {4,5,3,7,11};
        assertEquals(7, testSlot.payOff(tester));
    }
    
    //Tests Single Case - Power of Two
    @Test
    public void single_powerTwo() 
    {
        int[] tester = new int [] {2,5,3,7,11};
        assertEquals(3, testSlot.payOff(tester));
    }
    
    //Tests Single Case - Lucky Number
    @Test
    public void single_LuckyNumber() 
    {
        int[] tester = new int [] {42,5,3,7,11};
        assertEquals(2, testSlot.payOff(tester));
    }
    
    //Combinatorial Tests Multiple Cases - 6,7,8
    public void multi_SixSevenEight() 
    {
    	int[] tester = new int [] {4,42,5,3,7};
        assertEquals(12, testSlot.payOff(tester));
    }
    
    //Combinatorial Tests Multiple Cases - 2,7
    public void multi_TwoSeven() 
    {
    	int[] tester = new int [] {7,7,7,7,42};
        assertEquals(100002, testSlot.payOff(tester));
    }
    
    //Combinatorial Tests Multiple Cases - 3,6
    public void multi_ThreeSix() 
    {
    	int[] tester = new int [] {9,9,9,5,7};
        assertEquals(5007, testSlot.payOff(tester));
    }
    
    //Combinatorial Tests Multiple Cases - 4,6
    public void multi_FourSix() 
    {
    	int[] tester = new int [] {3,3,3,9,9};
        assertEquals(107, testSlot.payOff(tester));
    }
    
    //Combinatorial Tests Multiple Cases - 6,8
    public void multi_SixEight() 
    {
    	int[] tester = new int [] {1,3,5,11,7};
        assertEquals(10, testSlot.payOff(tester));
    }
    	
    //Combinatorial Tests Multiple Cases - 1,6,8
    public void multi_OneSixEight() 
    {
    	int[] tester = new int [] {4,4,4,4,4};
        assertEquals(1000010, testSlot.payOff(tester));
    }
    
    //Combinatorial Tests Multiple Cases - 5,6,7,8
    public void multi_FiveSixSevenEight() 
    {
    	int[] tester = new int [] {1,1,42,5,3};
        assertEquals(22, testSlot.payOff(tester));
    }  
    
    //Combinatorial Tests Multiple Cases - 5,6,8
    public void multi_FiveSixEight() 
    {
    	int[] tester = new int [] {1,1,5,3,7};
        assertEquals(20, testSlot.payOff(tester));
    }  
    
}
