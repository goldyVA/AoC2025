import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day3Part1
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day3.txt"));
    	
    	while(scan.hasNextLine())
    	{
    		String temp = scan.nextLine();
    		list.add(temp);
    		
    	}
    }
    catch(Exception e) 
    {	
    }
    
    long sum = 0;
    for(String x: list)
    {
    	char min = 0;
    	int minIndex = -1;
    	for(int i = 0; i < x.length()-1; i++)
    	{
    		if(x.charAt(i) > min)
    		{
    			min = x.charAt(i);
    			minIndex = i;
    		}
    	}
    	char min2 = '0';
    	for(int i = minIndex + 1; i < x.length(); i++)
    	{
    		if(x.charAt(i) > min2)
    		{
    			min2 = x.charAt(i);
    		}
    	}
    	
    	
    	
    	
    	System.out.println(Long.parseLong(min+""+min2));
    	sum+=Long.parseLong(min+""+min2);
    	
    	
    }
    System.out.println(sum);

  }
}