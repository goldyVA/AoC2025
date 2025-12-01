import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day1Part2_2025
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day1.txt"));
    	
    	while(scan.hasNextLine())
    	{
    		String temp = scan.nextLine();
    		list.add(temp);
    		
    	}
    }
    catch(Exception e) 
    {	
    }
    
    int count = 0;
    int value = 50;
    for(String x: list)
    {
        char letter = x.charAt(0);
        int number = Integer.parseInt(x.substring(1));
        if(letter == 'R')
        {
            while(number>100)
            {
                number-=100;
                count++;
            }
            value+=number;
            if(value>99)
            {
                value-=100;
                count++;
            }
        }
        else
        {
            while(number>100)
            {
                number-=100;
                count++;
            }
            if(value==0)
            {
                count--;
            }
            value-=number;
            if(value == 0)
            {
                count++;
            }
            else if(value<0)
            {
                value+=100;
                count++;
            }
        }
    }
    System.out.println(count);
    

  }
}