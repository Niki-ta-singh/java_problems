public class solid_rohmbus 
{
    public static void main(String args[])
    {
        int n=5, i, j;
        {
           for( i=1; i<=n; i++)
           {
            for( j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for ( i=1; j<=n; j++)
            {
                System.out.print("*");
            }
           }
        }
    }
}
