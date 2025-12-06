import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day6Part1
{
  public static void main(String[] args) 
  {
    ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day6.txt"));
    	
    	while(scan.hasNextLine())
    	{
    		String temp = scan.nextLine();
    		String[] temp2 = temp.trim().split("\\s+");
    		ArrayList<String> temp3 = new ArrayList<String>();
    		for(String x: temp2)
    		{
    			temp3.add(x);
    		}
    		list.add(temp3);
    		
    	}
    }
    catch(Exception e) 
    {	
    }
    
    long sum = 0;
  
    for(int i = 0; i < list.get(0).size(); i++)
    {
    	sum += doMath(list,i);
    }
    System.out.println(sum);
    
    

  }
  
  public static long doMath(ArrayList<ArrayList<String>> x, int index)
  {
	  if(x.get(x.size()-1).get(index).equals("+"))
	  {
		  return add(x,index);
	  }
	  else
	  {
		  return multiply(x,index);
	  }
  }
  
  public static long add(ArrayList<ArrayList<String>> x, int index)
  {
	  long sum = 0;
	  for(ArrayList<String> y: x)
	  {
		  if(!y.get(index).equals("+")&&!y.get(index).equals("*"))
			  sum += Long.parseLong(y.get(index));
	  }
	  return sum;
	  
  }
  
  public static long multiply(ArrayList<ArrayList<String>> x, int index)
  {
	  long product = 1;
	  for(ArrayList<String> y: x)
	  {
		  if(!y.get(index).equals("+")&&!y.get(index).equals("*"))
			  product *= Long.parseLong(y.get(index));
	  }
	  return product;
  }
  
  
  
}