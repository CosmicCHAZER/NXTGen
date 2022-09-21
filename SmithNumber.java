import java.util.*;
public class SmithNumber
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        int primeFACTOR[] = new int[n];
        int TEMPn = n ;
        int SUMdigits = 0 ;
        while(TEMPn > 0)
        {
            int a = TEMPn % 10 ;
            SUMdigits = SUMdigits + a ;
            TEMPn = TEMPn / 10 ;
        }
        for(int i = 1 ; i <= n ; i++ )
        {
            
        }
    }
}