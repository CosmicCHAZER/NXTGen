import java.util.*;
public class EmirpNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        int tempn = n ;
        int rev = 0;
        int nDEV = 0 ;
        int revDEV = 0 ;
        while(tempn>0){
            int a = tempn % 10 ; 
            rev = rev*10 + a ;
            tempn = tempn / 10 ;
        }
        for(int i = 1 ; i <= n;i++)
        {
            if(n%i == 0)
                nDEV++;
        }
        for(int i = 1 ; i <= rev;i++)
        {
            if(rev%i == 0)
                revDEV++;
        }
        if(revDEV == nDEV)
            System.out.print("NUMBER IS EMIRP NUMBER");
        else
            System.out.print("NUMBER IS NOT EMIRP NUMBER");
    }
}