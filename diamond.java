
public class diamond
{
    public static void main(String args[])
    {
        int n=4;
        //upper half
        for( int j=1; j<=n-1; j++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    //lowerhalf

    {
        int n=4;
        for(int i=n; i>=1; i--)
        {
            //space
           for(int j=1; j<=n-i; j++)
         {
            System.out.print("");
          }
          //star
           for(int j=1; j<=2*i-1; j++)
          {
            System.out.print("*");
          }
        
            System.out.println("");
        }
      
    }
}