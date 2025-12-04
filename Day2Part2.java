import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day2Part2
{
  public static void main(String[] args) 
  {
    String value ="";
    
    try 
    {
    	Scanner scan = new Scanner(new File("day2.txt"));
    	value=scan.nextLine();
    	
    }
    catch(Exception e) 
    {	
    }
    
    
    String[] list = value.split(",");
    ArrayList<Long> invalid = new ArrayList<Long>();
    for(String x: list)
    {
    	long low = Long.parseLong(x.substring(0,x.indexOf("-")));
        long high = Long.parseLong(x.substring(x.indexOf("-")+1));
        String lowString = low+"";
        String highString = high+"";
        System.out.println(low+" "+high);
        for(long i = low; i<=high; i++)
        {
        	if((i+"").length() == 2)
        	{
        		if(allSame(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        	}
        	else if((i+"").length() == 3)
        	{
        		if(allSame(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        	}
        	else if((i+"").length() == 4)
        	{
        		if(allSame(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        		if(pairs(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        	}
        	else if((i+"").length() == 5)
        	{
        		if(allSame(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        	}
        	else if((i+"").length() == 6)
        	{
        		if(allSame(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        		if(pairs(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        		if(triples(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        	}
        	else if((i+"").length() == 7)
        	{
        		if(allSame(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        	}
        	else if((i+"").length() == 8)
        	{
        		if(allSame(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        		if(pairs(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        		if(quads(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);	
        	}
        	else if((i+"").length() == 9)
        	{
        		if(allSame(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        		if(triples(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        	}
        	else if((i+"").length() == 10)
        	{
        		if(allSame(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        		if(pairs(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        		if(fives(i+""))
        			if(!invalid.contains(i))
        				invalid.add(i);
        	}
        	
        }
        
        
    }

    long sum = 0;
    for(long x: invalid)
    {
      sum+=x;
    }
    System.out.println(sum);
    System.out.println(invalid);


    
    

  }
  
  
  public static boolean allSame(String x)
  {
	  char first = x.charAt(0);
	  for(int i = 1; i < x.length(); i++)
	  {
		  if(first != x.charAt(i))
			  return false;
	  }
	  return true;
  }
  
  public static boolean pairs(String x)
  {
	  String first = x.substring(0,2);
	  for(int i = 2; i < x.length(); i+=2)
	  {
		  if(!first.equals(x.substring(i,i+2)))
			  return false;
	  }
	  return true;
	  
  }
  
  public static boolean triples(String x)
  {
	  String first = x.substring(0,3);
	  for(int i = 3; i < x.length(); i+=3)
	  {
		  if(!first.equals(x.substring(i,i+3)))
			  return false;
	  }
	  return true;
	  
  }
  public static boolean quads(String x)
  {
	  String first = x.substring(0,4);
	  for(int i = 4; i < x.length(); i+=4)
	  {
		  if(!first.equals(x.substring(i,i+4)))
			  return false;
	  }
	  return true;
	  
  }
  public static boolean fives(String x)
  {
	  String first = x.substring(0,5);
	  for(int i = 5; i < x.length(); i+=5)
	  {
		  if(!first.equals(x.substring(i,i+5)))
			  return false;
	  }
	  return true;
	  
  }
  
  
  
  
  
}