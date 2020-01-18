package fun.xuefeng;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    //bug fixed
    public static int doNothing()
    {
        int i=1;
        i=i-1;

        return i;
    }
}
