public class IngredientRange implements Comparable<IngredientRange> 
{

    private long low;
    private long high;

    public IngredientRange(long l, long h) 
    {
        low = l;
        high = h;
    }

    
    public int compareTo(IngredientRange other) 
    {
    	int lowCompare = Long.compare(this.low, other.low);
        if (lowCompare != 0) 
        {
            return lowCompare; 
        }

        return Long.compare(this.high, other.high);
    }

    public boolean isValid(long x) 
    {
        return x >= low && x <= high;
    }

    
    public String toString() 
    {
        return low + "-" + high;
    }

    public long getLow() 
    {
        return low;
    }

    public long getHigh() 
    {
        return high;
    }
}
