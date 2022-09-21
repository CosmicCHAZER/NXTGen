import java.util.*;
public class PetersonNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        int tempn = n ;
        int sum = 0;
        while(tempn>0){
           int a = tempn % 10 ; 
           int pro = 1;
           for(int i = 1 ; i <= a ; i++ )
           {
                pro = pro * i ;
           }
           sum = sum + pro;
           tempn = tempn / 10 ;
        }
        if(sum == n)
        System.out.print("NUMBER IS PETERSON NUMBER");
        else
        System.out.print("NUMBER IS NOT PETERSON NUMBER");
    }
}