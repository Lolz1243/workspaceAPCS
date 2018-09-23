package tester;

public class Test
{

    public static void main( String[] args )
    {
        display(2009);

    }
    
    public static void printX(int n)
    {
        if (n <= 0)
        {
            System.out.print( 0 );
        }
        else
        {
            printX(n-1);
            System.out.print( n );
            printX(n-2);
        }
    }
    
    public static void enigma(int n)
    {
        for(int i = 0; i < n; i++)
        {
            enigma(i);
        }
        System.out.print( n );
    }
    
    public static void display(int x)
    {
        if(x >= 10)
        {
            display(x/10);
            System.out.println( x%10 );
        }
    }

}
