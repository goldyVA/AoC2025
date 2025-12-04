import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day3Part2
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
    	char min1 = 0;
    	int minIndex1 = -1;
    	for(int i = 0; i < x.length()-11; i++)
    	{
    		if(x.charAt(i) > min1)
    		{
    			min1 = x.charAt(i);
    			minIndex1 = i;
    		}
    	}
    	char min2 = '0';
    	int minIndex2 = minIndex1;
    	for(int i = minIndex1 + 1; i < x.length()-10; i++)
    	{
    		if(x.charAt(i) > min2)
    		{
    			min2 = x.charAt(i);
    			minIndex2 = i;
    		}
    	}
    	char min3 = '0';
    	int minIndex3 = minIndex2;
    	for(int i = minIndex2 + 1; i < x.length()-9; i++)
    	{
    		if(x.charAt(i) > min3)
    		{
    			min3 = x.charAt(i);
    			minIndex3 = i;
    		}
    	}
    	char min4 = '0';
    	int minIndex4 = minIndex3;
    	for(int i = minIndex3 + 1; i < x.length()-8; i++)
    	{
    		if(x.charAt(i) > min4)
    		{
    			min4 = x.charAt(i);
    			minIndex4 = i;
    		}
    	}
    	char min5 = '0';
    	int minIndex5 = minIndex4;
    	for(int i = minIndex4 + 1; i < x.length()-7; i++)
    	{
    		if(x.charAt(i) > min5)
    		{
    			min5 = x.charAt(i);
    			minIndex5 = i;
    		}
    	}
    	char min6 = '0';
    	int minIndex6 = minIndex5;
    	for(int i = minIndex5 + 1; i < x.length()-6; i++)
    	{
    		if(x.charAt(i) > min6)
    		{
    			min6 = x.charAt(i);
    			minIndex6 = i;
    		}
    	}
    	char min7 = '0';
    	int minIndex7 = minIndex6;
    	for(int i = minIndex6 + 1; i < x.length()-5; i++)
    	{
    		if(x.charAt(i) > min7)
    		{
    			min7 = x.charAt(i);
    			minIndex7 = i;
    		}
    	}
    	char min8 = '0';
    	int minIndex8 = minIndex7;
    	for(int i = minIndex7 + 1; i < x.length()-4; i++)
    	{
    		if(x.charAt(i) > min8)
    		{
    			min8 = x.charAt(i);
    			minIndex8 = i;
    		}
    	}
    	char min9 = '0';
    	int minIndex9 = minIndex8;
    	for(int i = minIndex8 + 1; i < x.length()-3; i++)
    	{
    		if(x.charAt(i) > min9)
    		{
    			min9 = x.charAt(i);
    			minIndex9 = i;
    		}
    	}
    	char min10 = '0';
    	int minIndex10 = minIndex9;
    	for(int i = minIndex9 + 1; i < x.length()-2; i++)
    	{
    		if(x.charAt(i) > min10)
    		{
    			min10 = x.charAt(i);
    			minIndex10 = i;
    		}
    	}
    	char min11 = '0';
    	int minIndex11= minIndex10;
    	for(int i = minIndex10 + 1; i < x.length()-1; i++)
    	{
    		if(x.charAt(i) > min11)
    		{
    			min11 = x.charAt(i);
    			minIndex11 = i;
    		}
    	}
    	char min12 = '0';
    	int minIndex12= minIndex11;
    	for(int i = minIndex11 + 1; i < x.length(); i++)
    	{
    		if(x.charAt(i) > min12)
    		{
    			min12 = x.charAt(i);
    			minIndex12 = i;
    		}
    	}
    	
    	
    	
    	
    	System.out.println(Long.parseLong(min1+""+min2+""+min3+""+min4+""+min5+""+min6+""+min7+""+min8+""+min9+""+min10+""+min11+""+min12));
    	sum+=Long.parseLong(min1+""+min2+""+min3+""+min4+""+min5+""+min6+""+min7+""+min8+""+min9+""+min10+""+min11+""+min12);
    	
    	
    }
    System.out.println(sum);

  }
}