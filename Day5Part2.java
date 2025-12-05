import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day5Part2
{
  public static void main(String[] args) 
  {
    ArrayList<IngredientRange> list = new ArrayList<IngredientRange>();
    
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
    			list.add(new IngredientRange(Long.parseLong(first),Long.parseLong(second)));
    		}
    		
    	}
    }
    catch(Exception e) 
    {	
    }
    
    
    Collections.sort(list);
    
    
    for(int i = 0; i < list.size(); i++)
    {
    	if(i!=list.size()-1 && list.get(i).getLow() <= list.get(i+1).getLow() && list.get(i).getHigh() >= list.get(i+1).getHigh())
    	{
    		list.remove(i+1);
    		if(i!=0)
    			i--;
    	}
    	else if(i!=list.size()-1 && list.get(i).getHigh() >= list.get(i+1).getLow())
    	{
    		list.set(i, new IngredientRange(list.get(i).getLow(),list.remove(i+1).getHigh()));
    	}
    	if(i!=0 && list.get(i).getLow() <= list.get(i-1).getHigh())
    	{
    		list.set(i-1, new IngredientRange(list.get(i-1).getLow(),list.get(i).getHigh()));
    		list.remove(i);
    		i--;
    	}
    	
    	
    	
    }
    
    long count = 0;
    for(IngredientRange x: list)
    {
    	count += x.getHigh()-x.getLow()+1;
    }
    System.out.println(count);
    
    
    
    
    
    
    
	  
  }
  
  
  
}