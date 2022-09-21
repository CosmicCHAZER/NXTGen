import java.util.*;  
public class StrontioNumber
{  
    public static void main(String args[])   
    {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("ENTER A NUMBER");
        int num = sc.nextInt();  
        num=(num*2%1000)/10;
        if(num%10==num/10)   
            System.out.println("NUMBER IS STRONTIO NUMBER");  
        else   
            System.out.println("NUMBER IS NOT STRONTIO NUMBER ");  
    }  
}  