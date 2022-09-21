import java.util.*;  
public class Xylem_PhloemNumber
{  
    public static void main(String args[])  
    {  
        int extremesum = 0, midsum = 0;   
        Scanner sc = new Scanner (System.in);  
        System.out.print("ENTER A NUMBER");  
        int num = sc.nextInt();  
        num = Math.abs(num);  
        int TEMPnum = num;   
        while(TEMPnum != 0)  
        {  
            if(TEMPnum == num || TEMPnum < 10)   
                extremesum = extremesum + TEMPnum % 10;  
            else   
                midsum = midsum + TEMPnum % 10;  
            TEMPnum = TEMPnum / 10;  
        }  
        System.out.println("THE SUM OF EXTREME DIGITS: " + extremesum );  
        System.out.println("THE SUM OF MIDDLE DIGITS: "+ midsum);  
        if(extremesum  == midsum)  
            System.out.println("NUMBER IS XYLEM NUMBER");  
        else  
            System.out.println("NUMBER IS PHLOEM NUMBER.");  
    }  
} 