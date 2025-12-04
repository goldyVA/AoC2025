import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day4Part2
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day4.txt"));
    	
    	while(scan.hasNextLine())
    	{
    		String temp = scan.nextLine();
    		list.add(temp);
    		
    	}
    }
    catch(Exception e) 
    {	
    }
    
    
    char[][] grid = new char[list.size()+2][list.get(0).length()+2];
    for(int i = 0; i < grid.length; i++)
    {
    	
    	for(int j = 0; j < grid[0].length; j++)
    	{
    		grid[i][j]= ' ';
    	}
    	
    }
    
    for(int i = 0; i < list.size(); i++)
    {
    	String x = list.get(i);
    	for(int j = 0; j < x.length(); j++)
    	{
    		grid[i+1][j+1] = x.charAt(j);
    	}
    }
    
    int sum = 0;
    ArrayList<String> toRemove = new ArrayList<String>();
    boolean anyRemoved = true;
    while(anyRemoved ==true)
    {
    	anyRemoved = false;
    	for(int i = 1; i < grid.length-1; i++)
        {
        	
        	for(int j = 1; j < grid[0].length-1; j++)
        	{
        		if(grid[i][j] == '@' &&lessThan4(grid,i,j))
        		{
        			sum++;
        			toRemove.add(i+","+j);
        			anyRemoved = true;
        		}
        	}
        }
      
        
        while(toRemove.size()>0)
        {
        	String x = toRemove.remove(0);
        	grid[getRow(x)][getCol(x)] = '.';
        }
    }
    
    System.out.println(sum);

  }
  
  public static int getRow(String x)
  {
	  return Integer.parseInt(x.substring(0,x.indexOf(",")));
  }
  public static int getCol(String x)
  {
	  return Integer.parseInt(x.substring(x.indexOf(",")+1));
  }
  
  public static boolean lessThan4(char[][] temp, int r, int c)
  {
	  int count = 0;
	  if(temp[r-1][c-1] == '@')
		  count++;
	  if(temp[r-1][c] == '@')
		  count++;
	  if(temp[r-1][c+1] == '@')
		  count++;
	  if(temp[r][c-1] == '@')
		  count++;
	  if(temp[r][c+1] == '@')
		  count++;
	  if(temp[r+1][c-1] == '@')
		  count++;
	  if(temp[r+1][c] == '@')
		  count++;
	  if(temp[r+1][c+1] == '@')
		  count++;
	  if(count<4)
		  return true;
	  return false;
	  
	  
  }
  
  
  
}