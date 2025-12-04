import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day2Part1
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
        String lowString = low +"";
        String highString = high+"";
        String firstHalf;
        if(lowString.length()%2==0)
          firstHalf = lowString.substring(0,lowString.length()/2);
        else
        {
          firstHalf="1";
          for(int i = 0; i < lowString.length()/2; i++)
          {
            firstHalf+="0";
          }
        }
        long firstHalfNum = Long.parseLong(firstHalf);
        while(Long.parseLong(firstHalfNum+""+firstHalfNum)<=high)
        {
          if(Long.parseLong(firstHalfNum+""+firstHalfNum)>=low)
          {
            invalid.add(Long.parseLong(firstHalfNum+""+firstHalfNum));
            //System.out.println(invalid);
          }
          firstHalfNum++;
          
        }
    }

    long sum = 0;
    for(long x: invalid)
    {
      sum+=x;
    }
    System.out.println(sum);


    
    

  }
}