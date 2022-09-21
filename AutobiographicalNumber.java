import java.util.*;  
public class AutobiographicalNumber
{  
    public static void main(String args[])  
    { 
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number to check: ");  
        int n = sc.nextInt();  
        int TEMPn = n;  
        int digits = 0;
        while (TEMPn > 0)  
        {     
            digits++;  
            TEMPn = TEMPn / 10;  
        }    
        TEMPn= n ;
        int sum = 0 ;
        while (TEMPn > 0)  
        {     
            int a = TEMPn % 10 ;
            sum = sum + a ;  
            TEMPn = TEMPn / 10;  
        }    

        if(sum == digits)
            System.out.print("NUMBER IS AUTOBIOGRAPHICAL NUMBER");
        else
            System.out.print("NUMBER IS NOT AUTOBIOGRAPHICAL NUMBER");
    }  
}  