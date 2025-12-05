import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day5Part1
{
  public static void main(String[] args) 
  {
    ArrayList<Long> ingredientList = new ArrayList<Long>();
    ArrayList<IngredientRange> ranges = new ArrayList<IngredientRange>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day5.txt"));
    	
    	while(scan.hasNextLine())
    	{
    		String temp = scan.nextLine();
    		if(temp.contains("-"))
    		{
    			String first = temp.substring(0,temp.indexOf("-"));
    			String second = temp.substring(temp.indexOf("-")+1);
    			ranges.add(new IngredientRange(Long.parseLong(first),Long.parseLong(second)));
    		}
    		else if(temp.length()>0)
    		{
    			ingredientList.add(Long.parseLong(temp));
    		}
    		
    	}
    }
    catch(Exception e) 
    {	
    }
    
    System.out.println(ingredientList);
    System.out.println("\n\n\n"+ranges);
    
    int count = 0;
    for(long x: ingredientList)
    {
    	boolean valid = false;
    	for(IngredientRange range: ranges)
    	{
    		if(range.isValid(x))
    			valid = true;
    	}
    	if(valid)
    		count++;
    }
    
    System.out.println(count);
    
    
	  
  }
  
  
  
}