import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day6Part2
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day6.txt"));
    	
    	while(scan.hasNextLine())
    	{
    		String temp = scan.nextLine();
    		list.add(temp);
    	}
    }
    catch(Exception e) 
    {	
    }
    
    ArrayList<ArrayList<String>> values = new ArrayList<ArrayList<String>>();
    values.add(new ArrayList<String>());
    values.add(new ArrayList<String>());
    values.add(new ArrayList<String>());
    values.add(new ArrayList<String>());
    values.add(new ArrayList<String>());
    

    ArrayList<Integer> starts = new ArrayList<Integer>();
    for(int i = 0; i < list.get(4).length(); i++)
    {
    	if(list.get(4).charAt(i) == '+' || list.get(4).charAt(i) == '*')
    	{
    		starts.add(i);
    	}
    }
    
    for(int i = 0; i < starts.size(); i++)
    {
    	if(i==starts.size()-1)
    	{
    		int current = starts.get(i);
    		values.get(0).add(list.get(0).substring(current)+" ");
        	values.get(1).add(list.get(1).substring(current)+" ");
        	values.get(2).add(list.get(2).substring(current)+" ");
        	values.get(3).add(list.get(3).substring(current)+" ");
        	values.get(4).add(list.get(4).substring(current,current+1));
    	}
    	else
    	{
    		int current = starts.get(i);
        	int next = starts.get(i+1);
        	values.get(0).add(list.get(0).substring(current,next));
        	values.get(1).add(list.get(1).substring(current,next));
        	values.get(2).add(list.get(2).substring(current,next));
        	values.get(3).add(list.get(3).substring(current,next));
        	values.get(4).add(list.get(4).substring(current,current+1));
    	}
    	
    }
    
    
    
    
    
    long sum = 0;
    for(int i = 0; i <starts.size();i++)
    {
    	//System.out.println(doMath(values,i));
    	sum+=doMath(values,i);
    }
    System.out.println(sum);

  }
  
  public static long doMath(ArrayList<ArrayList<String>> x, int index)
  {
	  if(x.get(4).get(index).equals("+"))
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
	  ArrayList<Long> values = new ArrayList<Long>();
	  for(int j = x.get(0).get(index).length()-2; j >=0; j--)
	  {
		  String num = "";
		  for(int i = 0; i <4; i++)
		  {
			  if(x.get(i).get(index).charAt(j) != ' ')
			  {
				  num+=x.get(i).get(index).charAt(j);
			  }
			  
		  }
		  values.add(Long.parseLong(num));
	  }
 
	  for(long z: values)
	  {
		  sum+=z;
	  }
	  return sum;
	  
  }
  
  public static long multiply(ArrayList<ArrayList<String>> x, int index)
  {
	  long product = 1;
	  ArrayList<Long> values = new ArrayList<Long>();
	  for(int j = x.get(0).get(index).length()-2; j >=0; j--)
	  {
		  String num = "";
		  for(int i = 0; i <4; i++)
		  {
			  if(x.get(i).get(index).charAt(j) != ' ')
			  {
				  num+=x.get(i).get(index).charAt(j);
			  }
			  
		  }
		  values.add(Long.parseLong(num));
	  }
 
	  for(long z: values)
	  {
		  product*=z;
	  }
	  return product;
  }
  
  
  
}